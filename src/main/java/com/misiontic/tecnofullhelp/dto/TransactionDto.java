package com.misiontic.tecnofullhelp.dto;

import com.misiontic.tecnofullhelp.entities.Employee;
import java.util.Date;

public class TransactionDto {
    private Long id;
    private float amount;
    private String concept;
    private Employee employee;
    private Date createdAT;
    private Date updatedAt;

    public TransactionDto() {
    }

    public TransactionDto(Long id, float amount, String concept, Employee employee, Date createdAT, Date updatedAt) {
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

