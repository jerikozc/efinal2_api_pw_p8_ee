package main.java.uce.edu.web.repository;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import main.java.uce.edu.web.repository.modelo.Paciente;

@Transactional
@ApplicationScoped
public class PacienteRepoImpl implements IPacienteRepo{


    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Paciente> seleccionarTodos() {
      TypedQuery <Paciente> mQuery = this.entityManager.createQuery("Select p From Paciente p", Paciente.class);
       return mQuery.getResultList();
    }

    @Override
    public void insertar(Paciente paciente) {
      this.entityManager.persist(paciente);
    }

}
