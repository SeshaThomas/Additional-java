package com.srccodes.example;

 class Shape {
      static double pi=3.141592653589793238; 
	private String name;
	  public String getName() {
	        return name;
	}
	  public double getArea() {
		return 0;
		  
	  }
}
	
	class Circle extends Shape{
		
		float radius;
		Circle(float radius){
			this.radius=radius;
		}
		@Override
	   public double getArea() {
			return pi*radius*radius; 
		}
	}
	class Rectangle extends Shape {
	    float length;
	    float width;
	    
	    Rectangle(float length, float width) {
	        this.length = length;
	        this.width = width;
	    }
	    @Override
		 
	   public double getArea() {
	        return length * width;
	    }
	}
	
	
	
	
	    
	    
	    
	    
	    
	    
	
	
