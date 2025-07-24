package main.java.uce.edu.web.repository;

import java.util.List;

import main.java.uce.edu.web.repository.modelo.Paciente;

public interface IPacienteRepo {

     public List<Paciente> seleccionarTodos();

    public void insertar(Paciente paciente);

} 

   


