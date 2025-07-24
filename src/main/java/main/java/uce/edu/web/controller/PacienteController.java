package main.java.uce.edu.web.controller;

import java.util.List;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import main.java.uce.edu.web.repository.modelo.Doctor;
import main.java.uce.edu.web.repository.modelo.Paciente;
import main.java.uce.edu.web.service.IDoctorService;
import main.java.uce.edu.web.service.IPacienteService;

@Path("/doctores")
@Consumes()
@Produces()
public class PacienteController {

     @Inject
    private IPacienteService iPacienteService;

    @GET
    @Path("")
    public List<Paciente> mostrarTodos() {
        return this.iPacienteService.mostrarTodos();
    }


    @GET
    @Path("")
    public void guardar(Paciente paciente) {
        this.iPacienteService.guardar(paciente);
    }

}
