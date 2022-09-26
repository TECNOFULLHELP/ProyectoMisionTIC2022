package com.misiontic.tecnofullhelp.dto;

import com.misiontic.tecnofullhelp.entities.Enterprise;
import com.misiontic.tecnofullhelp.entities.Enum_role;
import com.misiontic.tecnofullhelp.entities.Transaction;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class EmployeeDto {
    private Long id;
    private String name;
    private String email;
    private Enterprise enterprise;
    private List<Transaction> listTransaction;
    private Enum_role role;
    private LocalDateTime  createdAT;
    private LocalDateTime updatedAt;

    public EmployeeDto() {
    }

    public EmployeeDto(Long id, String name, String email, Enterprise enterprise, List<Transaction> listTransaction, Enum_role role, LocalDateTime createdAT, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.enterprise = enterprise;
        this.listTransaction = listTransaction;
        this.role = role;
        this.createdAT = createdAT;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<Transaction> getListTransaction() {
        return listTransaction;
    }

    public void setListTransaction(List<Transaction> listTransaction) {
        this.listTransaction = listTransaction;
    }

    public Enum_role getRole() {
        return role;
    }

    public void setRole(Enum_role role) {
        this.role = role;
    }

    public LocalDateTime getCreatedAT() {
        return createdAT;
    }

    public void setCreatedAT(LocalDateTime createdAT) {
        this.createdAT = createdAT;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "EmployeeDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", enterprise=" + enterprise +
                ", listTransaction=" + listTransaction +
                ", role=" + role +
                ", createdAT=" + createdAT +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
