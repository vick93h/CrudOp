package com.example.crudop.Service;

import com.example.crudop.Model.Persona;
import com.example.crudop.Repository.personaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@Service
public class personaService {
    @Autowired
private  personaRepo personaR;


    @PostMapping
    public void insertPersona(Persona p) {
      personaR.save(p);
    }
@DeleteMapping
    public  void deletePersona(long id) {
    personaR.deleteById(id);
    }
@PutMapping
    public  void updatePersona(Persona p, long id) {
    Persona p_appoggio=new Persona();
    p_appoggio=personaR.getReferenceById(id);
    p_appoggio.setNome(p.getNome());
    p_appoggio.setCognome(p.getCognome());
    p_appoggio.setEmail(p.getEmail());
    p_appoggio.setSesso(p.getSesso());
    p_appoggio.setAvatar(p.getAvatar());
    p_appoggio.setMestiere(p.getMestiere());
    personaR.save(p_appoggio);
    }


    @GetMapping //permette di avere una risposta in http format
    public List<Persona> findByAllPerson() {
        return personaR.findByAllPerson();
    }

}
