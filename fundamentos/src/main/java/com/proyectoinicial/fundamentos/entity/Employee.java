package com.proyectoinicial.fundamentos.entity;

public class Employee {
    enum Roles{ADMINISTRADOR, OPERATIVO}

    public String nombre;
    public String correo;
    //Falta la relacion a la empresa a la que pertenece
    public String rol;

    public Employee(String nombre, String correo, String rol) {
        this.nombre = nombre;
        this.correo = correo;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
