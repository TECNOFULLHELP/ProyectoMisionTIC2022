package com.misiontic.tecnofullhelp.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
@Entity
@Table(name="transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="amount")
    private float amount;

    @Column(name="concept")
    private String concept;

    @ManyToOne
    @JoinColumn(name="employee_id")
    private Employee employee;

    @Column(name="createdat")
    private LocalDate createdAT;

    @Column(name="updatedat")
    private LocalDate updatedAt;

    public Transaction() {
    }

    public Transaction(float amount, String concept, Employee employee, LocalDate createdAT, LocalDate updatedAt) {
        this.amount = amount;
        this.concept = concept;
        this.employee = employee;
        this.createdAT = createdAT;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
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
        return "Transaction{" +
                "id=" + id +
                ", amount=" + amount +
                ", concept='" + concept + '\'' +
                ", employee=" + employee +
                ", createdAT=" + createdAT +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
