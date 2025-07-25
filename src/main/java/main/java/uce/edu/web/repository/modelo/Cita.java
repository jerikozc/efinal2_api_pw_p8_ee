package main.java.uce.edu.web.repository.modelo;

import jakarta.persistence.*;

@Entity
@Table(name="cita")
public class Cita {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name = "cita_id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    @Column(name = "cita_fecha_hora")
    private java.time.LocalDateTime fechaHora;

    /////////////////////////////
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public java.time.LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(java.time.LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    // getters y setters

    
}
