package com.misiontic.tecnofullhelp.dto;

import com.misiontic.tecnofullhelp.entities.Employee;
import java.time.LocalDate;
import java.util.List;

public class EnterpriseDto {
    private Long id;
    private Long nit;
    private String name;
    private String address;
    private String phone;
    private List<Employee> listEmployee;
    private LocalDate createdAT;
    private LocalDate updatedAt;

    public EnterpriseDto() {
    }

    public EnterpriseDto(Long id, Long nit, String name, String address, String phone, List<Employee> listEmployee, LocalDate createdAT, LocalDate updatedAt) {
        this.id = id;
        this.nit = nit;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.listEmployee = listEmployee;
        this.createdAT = createdAT;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return "EnterpriseDto{" +
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
