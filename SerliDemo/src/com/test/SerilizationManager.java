package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerilizationManager {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.password = "@#$@#$34324";
		c.ssnNum = "AEEEEE";
		c.accNum = "A67868787";
		c.email = "abc@email.com";
		c.name = "abc";
		
		System.out.println("customer Info :"+c);
		File f = new File("cust.txt");
		try {
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(c);
			oos.close();
			
			System.out.println("Object write part is done.");
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
