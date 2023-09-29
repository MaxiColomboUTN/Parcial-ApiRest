package com.example.Parcial1Programacion.controllers;

import com.example.Parcial1Programacion.entities.Persona;
import com.example.Parcial1Programacion.services.PersonaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*") //Permite el acceso a nuestra api desde distintos origenes( distintos clientes )
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona,PersonaServiceImpl>{








}

