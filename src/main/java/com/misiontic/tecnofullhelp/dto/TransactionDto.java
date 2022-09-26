package com.misiontic.tecnofullhelp.dto;

import com.misiontic.tecnofullhelp.entities.Employee;

import java.time.LocalDate;
import java.util.Date;

public class TransactionDto {
    private Long id;
    private float amount;
    private String concept;
    private Employee employee;
    private LocalDate createdAT;
    private LocalDate updatedAt;

    public TransactionDto() {
    }

    public TransactionDto(Long id, float amount, String concept, Employee employee, LocalDate createdAT, LocalDate updatedAt) {
        this.id = id;
        this.amount = amount;
        this.concept = concept;
        this.employee = employee;
        this.createdAT = createdAT;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return "TransactionDto{" +
                "id=" + id +
                ", amount=" + amount +
                ", concept='" + concept + '\'' +
                ", employee=" + employee +
                ", createdAT=" + createdAT +
                ", updatedAt=" + updatedAt +
                '}';
    }
}

