package main.java.uce.edu.web.controller;

import java.util.List;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import main.java.uce.edu.web.repository.modelo.Paciente;
import main.java.uce.edu.web.service.IPacienteService;

@Path("/pacientes")
public class PacienteController {

    @Inject
    private IPacienteService iPacienteService;

    @GET
    @Produces("application/json")
    public List<Paciente> mostrarTodos() {
        return this.iPacienteService.mostrarTodos();
    }

    @POST
    @Consumes("application/json")
    public void guardar(Paciente paciente) {
        this.iPacienteService.guardar(paciente);
    }
}
