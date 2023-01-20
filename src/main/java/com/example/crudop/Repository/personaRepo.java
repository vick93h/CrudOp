package com.example.crudop.Repository;

import com.example.crudop.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface personaRepo extends JpaRepository<Persona,Long> {
    //qui vanno le custom query non presenti nell' interfaccia JPA REPOSITORY
    @Query(value = "select * from Persona.persona",nativeQuery = true)
    List<Persona> findByAllPerson();

}
