package main.java.uce.edu.web.controller;

import java.util.List;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import main.java.uce.edu.web.repository.modelo.Doctor;
import main.java.uce.edu.web.service.IDoctorService;

@Path("/doctores")
public class DoctorController {

    @Inject
    private IDoctorService iDoctorService;

    @GET
    @Path("")
    public List<Doctor> mostrarTodos(String genero) {
        return this.iDoctorService.mostrarTodos(genero);
    }


    @GET
    @Path("")
    public void guardar(Doctor doctor) {
        this.iDoctorService.guardar(doctor);
    }

}
