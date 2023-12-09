package com.appgym.logica;

public class Persona {

    private int dni;
    private String nombre;
    private String apelldo;
    private String email;
    private int telefono;

    public Persona() {
    }

    public Persona(int dni, String nombre, String apelldo, String email, int telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apelldo = apelldo;
        this.email = email;
        this.telefono = telefono;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelldo() {
        return apelldo;
    }

    public void setApelldo(String apelldo) {
        this.apelldo = apelldo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
