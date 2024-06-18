package com.segunda.ejemplodoscurso.controllers;


import com.segunda.ejemplodoscurso.models.dto.ParamDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false, defaultValue = "Hola Johan , ¿Còmo va todo ? ") String message){

        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }
}
