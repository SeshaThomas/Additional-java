package com.srccodes.example;

import java.time.LocalDate;

public class Payroll {

	  private int payrollID;
	    private int employeeID;
	    private LocalDate payPeriodStartDate;
	    private LocalDate payPeriodEndDate;
	    private double basicSalary;
	    private double overtimePay;
	    private double deductions;
	    private double netSalary;
	    
	   public Payroll(){
	    	this.payrollID=0;
	    	this.employeeID=0;
	    	this.payPeriodStartDate=LocalDate.now();
	    	this.payPeriodEndDate=LocalDate.now();
	    	this.basicSalary=0.0;
	    	this.overtimePay=0.0;
	        this.deductions=0.0;
	        this.netSalary=0.0;
	    	
	    }
	   
	   public Payroll(int payrollID,int employeeID,LocalDate payPeriodStartDate,LocalDate payPeriodEndDate,double basicSalary,double overtimePay,double deductions,double netSalary) {
		   this.payrollID=payrollID;
	    	this.employeeID=employeeID;
	    	this.payPeriodStartDate=payPeriodStartDate;
	    	this.payPeriodEndDate=payPeriodEndDate;
	    	this.basicSalary=basicSalary;
	    	this.overtimePay=overtimePay;
	        this.deductions=deductions;
	        this.netSalary=netSalary;
	   }
	    public int getpayrollID() {
			return payrollID;
	    	
	    }
	    public void setpayrollID(int payrollID) {
	    	this.payrollID=payrollID;
	    }
	    public int getemployeeID() {
			return employeeID;
	    	
	    }
	    public void setemployeeID(int employeeID) {
	    	this.employeeID=employeeID;
	    }
	    public LocalDate getpayPeriodStartDate() {
			return payPeriodStartDate;
	    	
	    }
	    public void setpayPeriodStartDate(LocalDate payPeriodStartDate) {
	    	this.payPeriodStartDate=payPeriodStartDate;
	    }
	    public LocalDate getpayPeriodEndDate() {
			return payPeriodEndDate;
	    	
	    }
	    public void setpayPeriodEndDate(LocalDate payPeriodEndDate) {
	    	this.payPeriodEndDate=payPeriodEndDate;
	    }
	    public double getbasicSalary() {
			return basicSalary;
	    	
	    }
	    public void setbasicSalary(double basicSalary) {
	    	this.basicSalary=basicSalary;
	    }
	    public double getovertimePay() {
			return overtimePay;
	    	
	    }
	    public void setovertimePay(double overtimePay) {
	    	this.overtimePay=overtimePay;
	    }
	    public double getdeductions() {
			return deductions;
	    	
	    }
	    public void setdeductions(double deductions) {
	    	this.deductions=deductions;
	    }
	    public double getnetSalary() {
			return netSalary;
	    	
	    }
	    public void setnetSalary(double netSalary) {
	    	this.netSalary=netSalary;
	    }
	     
}
