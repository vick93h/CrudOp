package com.example.crudop.Repository;

import com.example.crudop.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface personaRepo extends JpaRepository<Persona,Long> {
    //qui vanno le custom query non presenti nell' interfaccia JPA REPOSITORY


}
