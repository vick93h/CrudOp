package com.example.crudop.Controller;

import com.example.crudop.Model.Persona;
import com.example.crudop.Service.personaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class controllerPersona {
@Autowired
    private personaService personaS;
@GetMapping("/getPersona/{id}")
    public Persona getPersona(@PathVariable("id") Long id){
    Persona p=new Persona();
    p=personaS.letPersona(id);
    return p;
}

}
