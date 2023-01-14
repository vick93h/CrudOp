package com.example.crudop.Controller;

import com.example.crudop.Model.Persona;
import com.example.crudop.Service.personaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class controllerPersona {
@Autowired
    private personaService personaS;
@GetMapping("/getAllPersona")
    public @ResponseBody List<Persona> getPersona(){

    return personaS.findByAllPerson();

}

}
