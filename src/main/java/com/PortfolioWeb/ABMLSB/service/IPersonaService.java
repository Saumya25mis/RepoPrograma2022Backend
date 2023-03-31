package com.PortfolioWeb.ABMLSB.service;

import com.PortfolioWeb.ABMLSB.model.Persona;
import java.util.List;



public interface IPersonaService {
    
        //metodo para traer todas las personas
    public List<Persona> verPersonas();
    
    //metodo para dar de alta una persona
    public void crearPersona(Persona per);
    
    //metodo para borrar una persona
    public void borrarPersona(Long id);
    
    //metodo para encontrar una persona
    public Persona buscarPersona(Long id);
    
}
