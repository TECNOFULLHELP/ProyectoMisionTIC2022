package com.proyectoinicial.fundamentos.entity;


public class Transaction {

    private double amount;
    private String concept;
    private Employee user;
    private Enterprise enterprise;

    public Transaction(double amount, String concept,Employee user, Enterprise enterprise) {
        this.amount = amount;
        this.concept = concept;
        this.user = user;
        this.enterprise = enterprise;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
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

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", concept='" + concept + '\'' +
                ", user=" + user +
                ", enterprise=" + enterprise +
                '}';
    }
}

