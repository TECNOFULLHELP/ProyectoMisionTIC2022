package com.misiontic.tecnofullhelp.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="transaction")
@JsonIgnoreProperties("employee")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="amount")
    private float amount;

    @Column(name="concept")
    private String concept;

    @ManyToOne
    @JoinColumn(name="employee_id", insertable = false, updatable = false)
    private Employee employee;

    @Column(name="createdat")
    private Date createdAT;

    @Column(name="updatedat")
    private Date updatedAt;

    public Transaction() {
    }

    public Transaction(float amount, String concept, Employee employee, Date createdAT, Date updatedAt) {
        this.amount = amount;
        this.concept = concept;
        this.employee = employee;
        this.createdAT = createdAT;
        this.updatedAt = updatedAt;
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
