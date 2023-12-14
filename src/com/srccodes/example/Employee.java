package com.srccodes.example;

import java.time.LocalDate;
import java.time.Period;


public class Employee {

	 private int employeeID;
	    private String firstName;
	    private String lastName;
	    private LocalDate dateOfBirth;
	    private String gender;
	    private String email;
	    private String phoneNumber;
	    private String address;
	    private String position;
	    private LocalDate joiningDate;
	    private LocalDate terminationDate;

	    // Constructors
	    public Employee() {
	    	this. employeeID=0;
	        this.firstName="default";
	        this.lastName="default";
	        this.dateOfBirth=LocalDate.now();
	        this.gender="default";
	        this.email="default";
	        this.phoneNumber="0000000000";
	        this.address="default";
	        this.position="default";
	        this.joiningDate=LocalDate.now();
	        this.terminationDate=LocalDate.now();
	    }

	    public Employee(int employeeID, String firstName, String lastName, LocalDate dateOfBirth, String gender,
	                    String email, String phoneNumber, String address, String position,
	                    LocalDate joiningDate, LocalDate terminationDate) {
	        this.employeeID = employeeID;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.dateOfBirth = dateOfBirth;
	        this.gender = gender;
	        this.email = email;
	        this.phoneNumber = phoneNumber;
	        this.address = address;
	        this.position = position;
	        this.joiningDate = joiningDate;
	        this.terminationDate = terminationDate;
	    }

	    public int getemployeeID() {
			return employeeID;
	    }
	    
	    public void setemployeeID(int employeeID) {
	    	this.employeeID=employeeID;
	    }
	    
	    public String getfirstName() {
			return firstName;	
	    }
	    public void setfirstName(String firstName) {
	    	this.firstName=firstName;
	    }
	    public String getlastName() {
			return lastName;	    	
	    }
	    public void setlastName(String lastName) {
	    	this.lastName=lastName;
	    }
	    public LocalDate getdateOfBirth() {
			return dateOfBirth;
	    	
	    }
	    public void setdateOfBirth(LocalDate dateOfBirth) {
	    	this.dateOfBirth=dateOfBirth;
	    }
	    public String getgender() {
			return gender;
	    	
	    }
	    public void setgender(String gender) {
	    	this.gender=gender;
	    }
	    public String getemail() {
			return email;
	    	
	    }
	    public void setemail(String email) {
	    	this.email=email;
	    }
	    public String getphoneNumber() {
			return phoneNumber;
	    	
	    }
	    public void setphoneNumber(String phoneNumber) {
	    	this.phoneNumber=phoneNumber;
	    }
	    public String address() {
			return address;
	    	
	    }
	    public void setaddress(String address) {
	    	this.address=address;
	    }
	    public String getposition() {
			return position;
	    	
	    }
	    public void setposition(String position) {
	    	this.position=position; 
	    }
	    public LocalDate getjoiningDate() {
			return joiningDate;
	    	
	    }
	    public void setjoiningDate(LocalDate joiningDate) {
	    	this.joiningDate=joiningDate;
	    }
	    public LocalDate getterminationDate() {
			return terminationDate;
	    	
	    }
	    public void setterminationDate(LocalDate terminationDate) {
	    	this.terminationDate=terminationDate;
	    }
	  
	
	    // Method
	    public   static int calculateAge(LocalDate dateOfBirth) {
	      
            	        LocalDate curDate=LocalDate.now();
            	        if((dateOfBirth!=null)&&(curDate!=null)) { 
            	        	return Period.between(dateOfBirth, curDate).getYears();
            	        }
            	        else {
            	        	return 0;
            	        }
	    }
	} 

