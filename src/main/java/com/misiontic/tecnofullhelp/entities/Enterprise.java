package com.misiontic.tecnofullhelp.entities;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="enterprise")
public class Enterprise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="nit")
    private Long nit;

    @Column(name="name")
    private String name;

    @Column(name="address")
    private String address;

    @Column(name="phone")
    private String phone;

    @OneToMany(mappedBy = "enterprise")
    private List<Employee> listEmployee;

    @Column(name="createdat")
    private LocalDate createdAT;

    @Column(name="updatedat")
    private LocalDate updatedAt;


    public Enterprise() {
    }

    public Enterprise(Long nit, String name, String address, String phone, List<Employee> listEmployee, LocalDate createdAT, LocalDate updatedAt) {
        this.nit = nit;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.listEmployee = listEmployee;
        this.createdAT = createdAT;
        this.updatedAt = updatedAt;
    }

    public Long getNit() {
        return nit;
    }

    public void setNit(Long nit) {
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

    public List<Employee> getListEmployee() {
        return listEmployee;
    }

    public void setListEmployee(List<Employee> listEmployee) {
        this.listEmployee = listEmployee;
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
                "id=" + id +
                ", nit=" + nit +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", listEmployee=" + listEmployee +
                ", createdAT=" + createdAT +
                ", updatedAt=" + updatedAt +
                '}';
    }
}