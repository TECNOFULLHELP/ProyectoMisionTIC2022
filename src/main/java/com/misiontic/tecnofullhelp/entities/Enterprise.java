package com.misiontic.tecnofullhelp.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="enterprise")
public class Enterprise {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="nit")
    private long nit;
    @Column(name="name")
    private String name;
    @Column(name="address")
    private String address;
    @Column(name="phone")
    private String phone;

    @Column(name="createdat")
    private LocalDate createdAT;

    @Column(name="updatedat")
    private LocalDate updatedAt;

    @OneToMany(mappedBy = "enterprise")
    private List<Employee> listEmployee;

    public Enterprise() {
    }

    public Enterprise(long nit, String name, String address, String phone, LocalDate createdAT, LocalDate updatedAt) {
        this.nit = nit;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.createdAT = createdAT;
        this.updatedAt = updatedAt;

    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNit() {
        return nit;
    }

    public void setNit(long nit) {
        this.nit = nit;
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

    public LocalDate getCreatedAT() {
        return createdAT;
    }

    public void setCreatedAT(LocalDate createdAT) {
        this.createdAT = createdAT;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDate updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Enterprise{" +
                ", id=" + id +
                ", nit=" + nit +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", createdAT=" + createdAT +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
