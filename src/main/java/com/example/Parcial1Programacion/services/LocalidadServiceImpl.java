package com.example.Parcial1Programacion.services;

import com.example.Parcial1Programacion.entities.Localidad;
import com.example.Parcial1Programacion.repositories.BaseRepository;

public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService {

public LocalidadServiceImpl(BaseRepository<Localidad,Long> baseRepository){
    super(baseRepository);
}
}
