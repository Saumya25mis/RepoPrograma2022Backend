package com.PortfolioWeb.ABMLSB.service;

import com.PortfolioWeb.ABMLSB.model.Persona;
import com.PortfolioWeb.ABMLSB.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    @Autowired
    public PersonaRepository persoRepo;

    @Override
    public List<Persona> verPersonas() {
        return persoRepo.findAll();
    }

    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        //aca si no encuentro la persona, devuelvo un null, esa es la funcion que cumple el orElse
        return persoRepo.findById(id).orElse(null);
    }

}
