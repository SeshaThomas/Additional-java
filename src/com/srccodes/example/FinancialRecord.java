package com.srccodes.example;

import java.time.LocalDate;

public class FinancialRecord {

	private int recordID;
    private int employeeID;
    private LocalDate recordDate;
    private String description;
    private double amount;
    private String recordType;
    
    public FinancialRecord() {
    	this.recordID=0;
    	this.employeeID=0;
    	this.recordDate=LocalDate.now();
    	this.description="default";
    	this.amount=0;
    	this.recordType="default";
    	
    }

    
    public FinancialRecord(int recordID, int employeeID, LocalDate recordDate, String description, double amount, String recordType) {
        this.recordID = recordID;
        this.employeeID = employeeID;
        this.recordDate = recordDate;
        this.description = description;
        this.amount = amount;
        this.recordType = recordType;
    }

  
    public int getRecordID() {
        return recordID;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public LocalDate getRecordDate() {
        return recordDate;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public String getRecordType() {
        return recordType;
    }

    // Setter methods
    public void setRecordID(int recordID) {
        this.recordID = recordID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setRecordDate(LocalDate recordDate) {
        this.recordDate = recordDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }
}
 
