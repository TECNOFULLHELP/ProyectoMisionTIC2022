package com.misiontic.tecnofullhelp.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="email")
    private String email;

    @ManyToOne
    @JoinColumn(name="enterprise_id")
    private Enterprise enterprise;

    @OneToMany(mappedBy = "employee")
    private List<Transaction> listTransaction;

    @Column(name="role")
    private Enum_role role;

    @Column(name="createdat")
    private LocalDateTime createdAT;

    @Column(name="updatedat")
    private LocalDateTime updatedAt;

    public Employee() {
    }

    public Employee(String name, String email, Enterprise enterprise, List<Transaction> listTransaction, Enum_role role, LocalDateTime createdAT, LocalDateTime updatedAt) {
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
        return "Employee{" +
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
