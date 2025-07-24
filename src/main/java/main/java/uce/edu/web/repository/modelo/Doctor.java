package main.java.uce.edu.web.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name = "doct_id")
    private Integer id;

    @Column(name = "doct_nombre")
    private String nombre;

    @Column(name = "doct_apellido")
    private String apellido;

    @Column(name = "doct_genero")
    private String genero;

    @ManyToOne
    


    ////////////////////////////

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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    

}
