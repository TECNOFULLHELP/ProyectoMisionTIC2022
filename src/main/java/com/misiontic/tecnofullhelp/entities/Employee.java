package com.misiontic.tecnofullhelp.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="email")
    private String email;

    @ManyToOne
    @JoinColumn(name="enterprise_id", insertable = false, updatable = false)
    private Enterprise enterprise;

    @OneToMany(mappedBy = "employee")
    private List<Transaction> listTransaction;

    @Column(name="role")
    private Enum_role role;

    @Column(name="createdat")
    private Date createdAT;

    @Column(name="updatedat")
    private Date updatedAt;

    public Employee() {
    }

    public Employee(String name, String email, Enterprise enterprise, List<Transaction> listTransaction, Enum_role role, Date createdAT, Date updatedAt) {
        this.name = name;
        this.email = email;
        this.enterprise = enterprise;
        this.listTransaction = listTransaction;
        this.role = role;
        this.createdAT = createdAT;
        this.updatedAt = updatedAt;
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

    public Date getCreatedAT() {
        return createdAT;
    }

    public void setCreatedAT(Date createdAT) {
        this.createdAT = createdAT;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
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
