package com.example.crudop.Repository;

import com.example.crudop.Model.persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface personaRepo extends JpaRepository<persona,Long> {
    //qui vanno le custom query non presenti nell' interfaccia JPA REPOSITORY
    @Query(value = "select * from backend.persona",nativeQuery = true)
    List<persona> findByAllPerson();
    @Query(value = "select * from backend.persona where backend.persona.id=:id",nativeQuery = true)
    persona getPersonById(@Param("id")long id);
}
