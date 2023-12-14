package com.srccodes.example;

public class Addition {
	//primitive datatypes
	public static String addChar(char x,char y) {
		String addchar=String.valueOf(x)+String.valueOf(y);
		return addchar;
	}
	
	
	public static Boolean addBoolean(boolean x,boolean y) {
		boolean result=x&&y;
		return result;
	}
	
	public static float addFloat(float x,float y) {
		float res=x+y;
		return res;
	}
	
	//wrapper classes
	public static Integer addInt1(Integer x, Integer y) {
        Integer result = x + y;
        return result;
	}
        public static String addChar1(Character x, Character y) {
            String result = String.valueOf(x)+String.valueOf(y);
            return result;
        }
        
        public static Boolean addBoolean1(Boolean x, Boolean y) {
            boolean result = x && y;
            return result;
        }
        
        
        public static Float addFloat1(Float x, Float y) {
            Float result = x + y;
            return result;
        }
        
        
	
	
	public static void main(String[] args) {
		
		System.out.println("Addition example"); 
		 String a=addChar('x','y');
		System.out.println(a);
		
		boolean result=addBoolean(true,false);
		System.out.println(result);		
		
		float res=addFloat(5.5f,7.5f);
		System.out.println(res);
		
		//wrapper class
		 Integer integerResult = addInt1(50, 50);
		 System.out.println(integerResult);
	        String characterResult = addChar1('x', 'y');
	        System.out.println(characterResult);
	        Boolean booleanResult1 = addBoolean1(false, false);
	        System.out.println(booleanResult1);
	        Float floatResult1 = addFloat1(4.5f, 6.5f);
	        System.out.println(floatResult1 );
	}
  
}  
 
