
package com.PortfolioWeb.ABMLSB.controller;

import com.PortfolioWeb.ABMLSB.model.Persona;
import com.PortfolioWeb.ABMLSB.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    
   
    @Autowired
    private IPersonaService persoServ;

    @PostMapping("/crear/persona")
    public String agregarPersona(@RequestBody Persona pers) {
        persoServ.crearPersona(pers);
        //devuelve un string avisando si se creo correctamente
        return "La persona fue creada correctamente";
    }

    @GetMapping("/ver/personas")
    @ResponseBody
    public List<Persona> verPersonas() {
        return persoServ.verPersonas();
    }

    @DeleteMapping("/borrar/{id}")
    public String borrarPersona(@PathVariable Long id) {
        persoServ.borrarPersona(id);
        //devuelve un string avisando si se elimino correctamente
        return "La persona fue eliminada correctamente";
    }

    @PutMapping("/editar/persona/{id}")
    public Persona editarPersona(@PathVariable Long id,
            @RequestParam("nombre") String nombre,
            @RequestParam("apellido") String apellido) {

        //busco la persona en cuestion
        Persona pers = persoServ.buscarPersona(id);

        //esto tambien puede ir en service
        //para desacoplar mejor el codigo en un nuevo metodo
        pers.setNombre(nombre);
        pers.setApellido(apellido);

        persoServ.crearPersona(pers);
        //retorna la nueva persona
        return pers;
    }
    
}
