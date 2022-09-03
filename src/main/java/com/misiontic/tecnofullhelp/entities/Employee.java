package com.misiontic.tecnofullhelp.entities;

import java.util.Date;

public class Employee {

    private String name;
    private String email;
    private Enterprise enterprise;
    private Enum_role role;

   public Employee(String name, String email, Enterprise enterprise, Enum_role role) {
        this.name = name;
        this.email = email;
        this.enterprise = enterprise;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Enum_role getRole() {
        return role;
    }

    public void setRole(Enum_role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", enterprise=" + enterprise.getName() +
                ", role=" + role +
                '}';
    }
}