package com.PortfolioWeb.ABMLSB.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;
    
    private String nombre;
    private String apellido;
    private String email;
    private Long fechaNacimiento;
    private String telefono;
    private String localidad;
    private String sobreMi;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String email, Long fechaNacimiento, String telefono, String localidad, String sobreMi) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.localidad = localidad;
        this.sobreMi = sobreMi;
    }
    
    
            
    
}
