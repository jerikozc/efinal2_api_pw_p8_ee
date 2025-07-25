package main.java.uce.edu.web.repository.modelo;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "paciente")
public class Paciente {


    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name = "paci_id")
     private Integer id;

     @Column(name = "paci_nombre")
     private String nombre;

     @Column(name = "paci_apellido")
     private String apellido;

     @Column(name = "paci_fecha_Nacimiento")
     private LocalDateTime fechaNacimiento;

     @OneToMany(mappedBy = "paciente")
     private List<Cita> citas;

     /////////////////////////////////////

     public Integer getId() {
         return id;
     }

     public void setId(Integer id) {
         this.id = id;
     }

     public String getNombre() {
         return nombre;
     }

     public void setNombre(String nombre) {
         this.nombre = nombre;
     }

     public String getApellido() {
         return apellido;
     }

     public void setApellido(String apellido) {
         this.apellido = apellido;
     }

     public LocalDateTime getFechaNacimiento() {
         return fechaNacimiento;
     }

     public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
         this.fechaNacimiento = fechaNacimiento;
     }

     public List<Cita> getCitas() {
         return citas;
     }

     public void setCitas(List<Cita> citas) {
         this.citas = citas;
     }

}
