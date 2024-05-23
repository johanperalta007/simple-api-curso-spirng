package com.segunda.ejemplodoscurso.controllers;


import com.segunda.ejemplodoscurso.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api") //Ruta Main para acceder a la API REST. Esto de hecho es un estandar de buenas practicas
public class UserRestController {

    @GetMapping ("/details") //Es para cualquier obtener ruta Path URL , mediante un metodo GET
    public Map<String, Object> detailsOfProfiles() {
        Map<String, Object> body = new HashMap<>(); // El HashMap es ideal para crear un Json con nombre de atributo y su respectivo valor
        User user = new User("Johan","Peralta");

      body.put("companyName", "JP DATA SYSTEMS");
      body.put("welcome", "Welcome to JP DATA SYSTEMS Company");
      body.put("description", "Revolutionizing the way you interact with data. We specialize in innovative solutions that empower your business to thrive in the digital age.");
      body.put("user", user);

        return body;
    }

}
