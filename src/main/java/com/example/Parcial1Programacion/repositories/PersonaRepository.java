package com.example.Parcial1Programacion.repositories;

import com.example.Parcial1Programacion.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long> {

    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);

    Page<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido,Pageable pageable);



    //Anotacion JPQL parametros nombrados ***************************
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE '%:filtro%' OR p.apellido LIKE '%:filtro%'") //1 es la cantidad de parametros qeu le pasamos al metodo
    List<Persona> search(@Param("filtro") String filtro);
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE '%:filtro%' OR p.apellido LIKE '%:filtro%'") //1 es la cantidad de parametros qeu le pasamos al metodo
    Page<Persona> search(@Param("filtro") String filtro,Pageable pageable);



    //Query Nativ ***************************
    @Query(value = "SELECT * from persona WHERE persona.nombre LIKE '%?1%' OR persona.apellido LIKE '%?1%'",
    nativeQuery = true)
    List<Persona> searchNativ(@Param("filtro") String filtro);

    @Query(value = "SELECT * from persona WHERE persona.nombre LIKE '%?1%' OR persona.apellido LIKE '%?1%'",
            countQuery = "SELECT count(*) FROM persona",
            nativeQuery = true)
    Page<Persona> searchNativ(@Param("filtro") String filtro, Pageable pageable);

}
