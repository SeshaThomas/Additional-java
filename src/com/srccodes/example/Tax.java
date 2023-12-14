package com.srccodes.example;

public class Tax {

	 private int taxID;
	    private int employeeID;
	    private int taxYear;
	    private double taxableIncome;
	    private double taxAmount;
	    
	    
	    public Tax() {
	    	this.taxID=0;
	    	this.employeeID=0;
	    	this.taxYear=0;
	    	this.taxableIncome=0;
	    	this.taxAmount=0;
	    }
	    
	    public Tax(int taxID,int employeeID,int taxYear,double taxableIncome,double taxAmount) {
	    	this.taxID=taxID;
	    	this.employeeID=employeeID;
	    	this.taxYear=taxYear;
	    	this.taxableIncome=taxableIncome;
	    	this.taxAmount=taxAmount;
	    }
	    
	    public int gettaxID() {
			return taxID;
	    	
	    }
	    public void settaxID(int taxID) {
	    	this.taxID=taxID;
	    }
	    public int getemployeeID() {
			return employeeID;
	    	
	    }
	    public void setemployeeID(int employeeID) {
	    	this.employeeID=employeeID;
	    }
	    public int gettaxYear() {
			return taxYear;
	    	
	    }
	    public void settaxYear(int taxYear) {
	    	this.taxYear=taxYear;
	    }
	    public double gettaxableIncome() {
			return taxableIncome;
	    	
	    }
	    public void settaxableIncome(double taxableIncome) {
	    	this.taxableIncome=taxableIncome;
	    }
	    public double gettaxAmount() {
			return taxAmount;
	    	
	    }
	    public void settaxAmount(double taxAmount) {
	    	this.taxAmount=taxAmount;
	    }
   
}
