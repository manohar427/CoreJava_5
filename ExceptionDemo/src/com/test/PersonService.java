package com.test;

public class PersonService {
   
	public Person getPersonDetails(int personId) throws ArithmeticException,NullPointerException{
		
		Person p=null;
		
		try{
			int x =100/10;
			p =new Person("Abc", "Abc@email.com", 123);
			
		}
		catch(ArithmeticException e){
			//e.printStackTrace();
			throw  e;
		}
		catch(NullPointerException e){
			//e.printStackTrace();
			throw  e;
		}
		return p;
	}
}
