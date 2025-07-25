package main.java.uce.edu.web.service;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import main.java.uce.edu.web.repository.IDoctorRepo;
import main.java.uce.edu.web.repository.IPacienteRepo;
import main.java.uce.edu.web.repository.modelo.Paciente;

@ApplicationScoped
public class PacienteServiceImpl implements IPacienteService {

    @Inject
    private IPacienteRepo iPacienteRepo;

    @Override
    public List<Paciente> mostrarTodos() {
        return this.iPacienteRepo.seleccionarTodos();
    }

    @Override
    public void guardar(Paciente paciente) {
        this.iPacienteRepo.insertar(paciente);
    }

}
