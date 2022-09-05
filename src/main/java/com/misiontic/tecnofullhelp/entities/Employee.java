package com.misiontic.tecnofullhelp.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="email")
    private String email;
    @ManyToOne
    @JoinColumn(name="id", insertable = false, updatable = false)
    private Enterprise enterprise;

    @OneToMany(mappedBy = "employee")
    private List<Transaction> listTransaction;
    @Column(name="role")
    private Enum_role role;

    @Column(name="createdat")
    private Date createdAT;

    @Column(name="updatedat")
    private Date updatedAt;

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
