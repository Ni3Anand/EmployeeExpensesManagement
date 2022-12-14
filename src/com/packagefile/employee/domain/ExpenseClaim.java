package com.packagefile.employee.domain;

public class ExpenseClaim {
    private Integer id;
    private Integer employeeId;
    private String dateOfClaim;
    private Double totalAmount;
    private Boolean approved;
    private Boolean paid;

    public ExpenseClaim(Integer id, Integer employeeId, String dateOfClaim, Double totalAmount) {
        this.id = id;
        this.employeeId = employeeId;
        this.dateOfClaim = dateOfClaim;
        this.totalAmount = totalAmount;
        this.approved=false;
        this.paid=false;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public void setPaid(Boolean paid) {
        if(paid && !approved){
            System.out.println("This item cannot pe paid as it not been yet approved");
        }
        else{
            this.paid = paid;
        }
    }

    public Integer getId() {
        return id;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public String getDateOfClaim() {
        return dateOfClaim;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public Boolean getApproved() {
        return approved;
    }

    public Boolean getPaid() {
        return paid;
    }
}
