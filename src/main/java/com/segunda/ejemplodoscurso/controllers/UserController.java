package com.segunda.ejemplodoscurso.controllers;

import com.segunda.ejemplodoscurso.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping ("/details") //Es para cualquier obtener ruta Path URL , mediante un metodo GET
    public String detailsOfProfiles(Model model) {
        User user = new User("Johan"," Peralta");

      model.addAttribute("title", "JP DATA SYSTEMS");
      model.addAttribute("welcome", "Welcome to JP DATA SYSTEMS Company");
      model.addAttribute("description", "Revolutionizing the way you interact with data. We specialize in innovative solutions that empower your business to thrive in the digital age.");
      model.addAttribute("user", user);
        return "details";
    }

}
