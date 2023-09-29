package com.example.Parcial1Programacion.repositories;

import com.example.Parcial1Programacion.entities.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long> {



}
