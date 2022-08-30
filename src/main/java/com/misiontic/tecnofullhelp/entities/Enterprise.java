package com.misiontic.tecnofullhelp.entities;

import java.util.Date;


public class Enterprise {

    private long nit;
    private String name;
    private String address;
    private String phone;

    public Enterprise() {
    }

    public Enterprise(long nit, String name, String address, String phone) {
        this.nit = nit;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public long getNit() {
        return nit;
    }

    public void setNit(long nit) {
        this.nit= nit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Enterprise{" +
                "id=" + nit +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
