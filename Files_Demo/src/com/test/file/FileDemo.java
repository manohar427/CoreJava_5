package com.test.file;

import java.io.File;
import java.io.IOException;


public class FileDemo {
	public static void main(String[] args) {

		//abc.txt
		File f= new File("C:\\Users\\dell\\Desktop\\Temp\\abc.txt");
		try {
			boolean flag =  f.createNewFile();
			System.out.println("File Created:"+flag);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
