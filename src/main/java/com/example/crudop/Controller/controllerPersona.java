package com.example.crudop.Controller;


import com.example.crudop.Model.persona;
import com.example.crudop.Service.personaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class controllerPersona {
@Autowired
private personaService personaS;
@GetMapping("/person")
    public @ResponseBody List<persona> getPersona(){

    return personaS.findByAllPerson();

}
    @GetMapping("/person/{id}")
    public @ResponseBody persona getPersonabyId(@PathVariable("id") long id){

        return personaS.findByPersonId(id);

    }
    @PostMapping("/person")
    public void insertPersona(@RequestBody persona p) {
         personaS.insertPersona(p);
    }
    @DeleteMapping("/person/{id}")
    public void deletePersona(@PathVariable("id") long id) {
        personaS.deletePersona(id);
    }
    @PutMapping("/person/{id}")
    public void updatePersona(@RequestBody persona p, @PathVariable("id") long id) {
        personaS.updatePersona(p, id);
    }


}
