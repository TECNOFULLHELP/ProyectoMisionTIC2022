package com.misiontic.tecnofullhelp.entities;


import javax.persistence.*;
import java.util.Date;
@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="id_employee")
    private long id_employee;
    @Column(name="amount")
    private float amount;

    @Column(name="concept")
    private String concept;

    @ManyToOne
    @JoinColumn(name="id", insertable = false, updatable = false)
    private Employee employee;

    @Column(name="createdat")
    private Date createdAT;

    @Column(name="updatedat")
    private Date updatedAt;

    public Transaction() {
    }

    public Transaction(long id, long id_employee, float amount, String concept, Employee employee, Date createdAT, Date updatedAt) {
        this.id = id;
        this.id_employee = id_employee;
        this.amount = amount;
        this.concept = concept;
        this.employee = employee;
        this.createdAT = createdAT;
        this.updatedAt = updatedAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId_employee() {
        return id_employee;
    }

    public void setId_employee(long id_employee) {
        this.id_employee = id_employee;
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
                ", id_employee=" + id_employee +
                ", amount=" + amount +
                ", concept='" + concept + '\'' +
                ", employee=" + employee +
                ", createdAT=" + createdAT +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
