
package main.java.uce.edu.web.repository;

import java.util.List;

import main.java.uce.edu.web.repository.modelo.Doctor;



public interface IDoctorRepo {
    public List<Doctor> seleccionarTodos(String genero);

    public void insertar(Doctor doctor);
}
