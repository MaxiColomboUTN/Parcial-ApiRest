package com.example.Parcial1Programacion.controllers;

import com.example.Parcial1Programacion.entities.Base;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


import java.io.Serializable;

public interface BaseController <E extends Base,ID extends Serializable> {

    public ResponseEntity<?> getAll();//el signo es lo mismo que poner que extiende de un objeto
    public ResponseEntity<?> getAll(Pageable pageable);
    public ResponseEntity<?> getOne(@PathVariable ID id);
    public ResponseEntity<?> save(@RequestBody E entity);
    public ResponseEntity<?> update(@PathVariable ID id, @RequestBody E entity);
    public ResponseEntity<?> delete(@PathVariable ID id);
}
