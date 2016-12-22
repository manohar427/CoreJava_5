package com.test.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamDemo {

	
	public static void main(String[] args) {
        File f = new File("abc.txt");
		
		try {
			/*String name = "Coruse Founder Tech";
			String tech = "Technology";
			
			byte all[] = name.getBytes();
			byte all1[] = tech.getBytes();
			
			FileOutputStream fos = new FileOutputStream(f);
			fos.write(all);
			fos.write(all1);
			fos.close();
			System.out.println("Data write part is done.");*/
			
			FileInputStream fis = new FileInputStream(f);
			
			int i=0;
			while(( i = fis.read()) != -1){
				System.out.print((char)i);
			}
			
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

}
