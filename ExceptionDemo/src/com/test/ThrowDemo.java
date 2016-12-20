package com.test;

public class ThrowDemo {

	
	public static void main(String[] args) {
       
		PersonService ps = new PersonService();
		Person p=null;
		try
		{
			 p = ps.getPersonDetails(10);
		}catch(ArithmeticException e){
			System.out.println("Service failed due to Arithmetic exc..:"+e.getMessage());
		}
		
		System.out.println("Person details:"+p);
	}

}
