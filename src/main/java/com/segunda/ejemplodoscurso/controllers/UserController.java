package com.segunda.ejemplodoscurso.controllers;

import com.segunda.ejemplodoscurso.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {

    @GetMapping ("/details") //Es para cualquier obtener ruta Path URL , mediante un metodo GET
    public String detailsOfFrontEnd(Model model) {
        User user = new User("JOHAN"," PERALTA M.");
        //user.setEmail("johan.peralta007@outlook.com");
        user.setEmail("");

      model.addAttribute("title", "JP DATA SYSTEMS");
      model.addAttribute("welcome", "Welcome to JP DATA SYSTEMS Company");
      model.addAttribute("description", "Revolutionizing the way you interact with data. We specialize in innovative solutions that empower your business to thrive in the digital age.");
      model.addAttribute("user", user);

      return "details";
    }

    @GetMapping("/list")
        public String list(ModelMap model){

            List<User> users = Arrays.asList(new User ("Peppa", "Gonzalez"),
            new User("Armando" , "Benedetti"),
            new User("Juanito" , "El Gay"),
            new User("Andres" , "Doe"));
            model.addAttribute("users", users);
            model.addAttribute("title", "USERS JP DATA SYSTEMS");

            return "list";
        }

}
