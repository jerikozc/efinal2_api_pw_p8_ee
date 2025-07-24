package main.java.uce.edu.web.service;

import java.util.List;

import main.java.uce.edu.web.repository.modelo.Doctor;

public interface IDoctorService {

   public List<Doctor> mostrarTodos(String genero);

   public void guardar(Doctor doctor);
    
} 

  


