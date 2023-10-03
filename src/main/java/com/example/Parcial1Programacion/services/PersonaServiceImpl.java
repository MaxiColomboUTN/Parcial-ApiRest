package com.example.Parcial1Programacion.services;

import com.example.Parcial1Programacion.entities.Persona;
import com.example.Parcial1Programacion.repositories.BaseRepository;
import com.example.Parcial1Programacion.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona,Long> implements PersonaService{
  @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona,Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
    }
}
