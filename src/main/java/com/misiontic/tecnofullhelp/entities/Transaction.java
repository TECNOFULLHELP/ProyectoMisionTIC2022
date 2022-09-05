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

    public Transaction(float amount, String concept, Employee employee) {
        this.amount = amount;
        this.concept = concept;
        this.employee = employee;
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

    public Employee getUser() {
        return employee;
    }

    public void setUser(Employee user) {
        this.employee = user;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", concept='" + concept + '\'' +
                ", employee=" + employee.getName() +
                '}';
    }
}
