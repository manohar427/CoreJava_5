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
		/*Customer c = new Customer("Abc", "abc@email.com", "122324");

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
		}*/
		
		File f = new File("cust.txt");
		
		try {
			FileInputStream fip = new FileInputStream(f);
			ObjectInputStream oip = new ObjectInputStream(fip);
			Customer c = (Customer)oip.readObject();
			oip.close();
			System.out.println(c);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
