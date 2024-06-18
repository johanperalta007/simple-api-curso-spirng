package com.segunda.ejemplodoscurso.models;

public class User {

    private String name;
    private String lastname;
    private String  email;

    // Se agrega un constructor vacio a sgerencia del instructor
    public User() {
    }

    // Se agrega otro constructor para el Email y se simplifica el constructor de User
    public User(String name, String lastname, String email) {
        this(name,lastname);
        this.email = email;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
