package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ManagerClient2 {

	public static void main(String[] args) {
		File f = new File("cust.txt");

		try {
			FileInputStream fip = new FileInputStream(f);
			ObjectInputStream oip = new ObjectInputStream(fip);
			Customer c = (Customer) oip.readObject();
			oip.close();
			System.out.println(c);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
