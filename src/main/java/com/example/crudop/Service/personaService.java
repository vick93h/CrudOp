package com.example.crudop.Service;

import com.example.crudop.Model.Persona;
import com.example.crudop.Repository.personaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

@CrossOrigin(origins = "http://localhost:8080")
@Service
public class personaService {
    @Autowired
private personaRepo personaR;
    @GetMapping //permette di avere una risposta in http format
    public Persona letPersona(Long id) {
         return personaR.getById(id);
    }
}
