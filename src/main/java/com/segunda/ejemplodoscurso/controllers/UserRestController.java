package com.segunda.ejemplodoscurso.controllers;


import com.segunda.ejemplodoscurso.models.User;
import com.segunda.ejemplodoscurso.models.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/api") //Ruta Main para acceder a la API REST. Esto de hecho es un estandar de buenas practicas
public class UserRestController {

    @GetMapping ("/details") //Es para cualquier obtener ruta Path URL , mediante un metodo GET
    public UserDto details() {
        // Este metodo anexa forma de DTO. Esto se usa cuando no estes usando MVC (Modelo Vista Controlador)
        UserDto userDto = new UserDto();
        User user = new User("JOHAN","PERALTA M.");
        userDto.setUser(user);
        userDto.setTitle("Welcome to JP DATA SYSTEMS Company");
        return userDto;
    }

    @GetMapping("/list")
    public List<User> list(){

        User user = new User("JOHAN","PERALTA M.");
        User user2 = new User("VALENTINA","AREVALO T.");
        User user3 = new User("JUAN","RIVERA");

        List<User> users = Arrays.asList(user,user2,user3); // Eimina lìneas de código como las que estan comentadas abajo "ArrayList"

        //List<User> users = new ArrayList<>();
        //users.add(user);
        //users.add(user2);
        //users.add(user3);

        return users;
    }

    @GetMapping ("/details-map") //Es para cualquier obtener ruta Path URL , mediante un metodo GET
    public Map<String, Object> detailsmap() {
        User user = new User("JOHAN","PERALTA M.");

        Map<String, Object> body = new HashMap<>(); // El HashMap es ideal para crear un Json con nombre de atributo y su respectivo valor

        body.put("companyName", "JP DATA SYSTEMS");
        body.put("welcome", "Welcome to JP DATA SYSTEMS Company");
        body.put("description", "Revolutionizing the way you interact with data. We specialize in innovative solutions that empower your business to thrive in the digital age.");
        body.put("user", user);

        return body;
    }

}
