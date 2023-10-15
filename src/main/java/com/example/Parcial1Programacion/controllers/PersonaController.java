package com.example.Parcial1Programacion.controllers;

import com.example.Parcial1Programacion.entities.Persona;
import com.example.Parcial1Programacion.services.PersonaServiceImpl;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*") //Permite el acceso a nuestra api desde distintos origenes( distintos clientes )
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona,PersonaServiceImpl>{


@GetMapping("/search")

    public ResponseEntity<?> search(@RequestParam String filtro){

    try{
    return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro));
    }catch (Exception e){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intente mas tarde. GETALL\"}");
    }
}
    @GetMapping("/searchPaged")

    public ResponseEntity<?> search(@RequestParam String filtro, Pageable pageable){

        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro,pageable));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intente mas tarde. GETALL\"}");
        }
    }



}

