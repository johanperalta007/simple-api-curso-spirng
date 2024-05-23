package com.segunda.ejemplodoscurso.models;

public class User {

    private String name;
    private  String lastname;

    // Este es el constructor de la API
    public User(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }
    // Esto se genero con los Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


}
