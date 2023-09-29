package com.example.Parcial1Programacion.services;

import com.example.Parcial1Programacion.entities.Autor;
import com.example.Parcial1Programacion.repositories.AutorRepository;
import com.example.Parcial1Programacion.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}