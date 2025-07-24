package main.java.uce.edu.web.service;

import java.util.List;

import main.java.uce.edu.web.repository.modelo.Paciente;

public interface IPacienteService {


  public List<Paciente> mostrarTodos();

   public void guardar(Paciente paciente);

}
