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
    @PostMapping("/insertPerson")
    public void insertPersona(@RequestBody Persona p) {
         personaS.insertPersona(p);
    }
    @DeleteMapping("/deletePerson/{id}")
    public void deletePersona(@PathVariable("id") long id) {
        personaS.deletePersona(id);
    }
    @PutMapping("/updatePerson/{id}")
    public void updatePersona(@RequestBody Persona p, @PathVariable("id") long id) {
        personaS.updatePersona(p, id);
    }


}
