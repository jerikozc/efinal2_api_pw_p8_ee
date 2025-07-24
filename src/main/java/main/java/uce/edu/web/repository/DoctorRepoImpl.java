package main.java.uce.edu.web.repository;

import java.util.List;

import org.hibernate.dialect.function.json.MySQLJsonQueryFunction;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import main.java.uce.edu.web.repository.modelo.Doctor;

@Transactional
@ApplicationScoped
public class DoctorRepoImpl implements IDoctorRepo{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Doctor> seleccionarTodos(String genero) {
        TypedQuery <Doctor> mQuery = this.entityManager.createQuery("Select d From Doctor d Where d=:d.genero", Doctor.class);
        mQuery.setParameter("genero", genero);
       return mQuery.getResultList();
    }

    @Override
    public void insertar(Doctor doctor) {
      this.entityManager.persist(doctor);
    }

}
