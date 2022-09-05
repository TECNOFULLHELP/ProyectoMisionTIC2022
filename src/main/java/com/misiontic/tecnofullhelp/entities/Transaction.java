package com.misiontic.tecnofullhelp.entities;


import com.misiontic.tecnofullhelp.entities.Employee;

public class Transaction {

    private float amount;
    private String concept;
    Employee user;

    public Transaction(float amount, String concept, Employee employee) {
        this.amount = amount;
        this.concept = concept;
        this.user = employee;
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
        return user;
    }

    public void setUser(Employee user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", concept='" + concept + '\'' +
                ", employee=" + user.getName() +
                '}';
    }
}
