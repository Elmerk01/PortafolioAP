package com.Portfolio.Ap.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.lang.Long;
import javax.validation.constraints.Size;




@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long id;
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    
    private String nombre;
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    
    private String apellido;
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    
    private String dni;
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    
    private String telefono;
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
    
    private String email;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
       
    
}
