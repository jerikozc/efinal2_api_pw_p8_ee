package main.java.uce.edu.web.service;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import main.java.uce.edu.web.repository.IDoctorRepo;
import main.java.uce.edu.web.repository.modelo.Doctor;

@ApplicationScoped
public class DoctorServiceImpl implements IDoctorService {

    @Inject
    private IDoctorRepo iDoctorRepo;

    @Override
    public List<Doctor> mostrarTodos(String genero) {
        return this.iDoctorRepo.seleccionarTodos(genero);
    }

    @Override
    public void guardar(Doctor doctor) {
        this.iDoctorRepo.insertar(doctor);
    }




}
