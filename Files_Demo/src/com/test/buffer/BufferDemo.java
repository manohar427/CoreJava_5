package com.test.buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDemo {

	public static void main(String[] args) {

		File f = new File("xyz.doc");
		try {
			/*
			 * FileWriter fr = new FileWriter(f); BufferedWriter bw = new
			 * BufferedWriter(fr);
			 * 
			 * bw.write("Hi"); bw.newLine(); bw.write("Hellow to All");
			 * bw.newLine(); bw.write("Thanks you\n"); bw.write("XYZ");
			 * bw.close();
			 * 
			 * System.out.println("Data writing is done.");
			 */

			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);

			String oneLine = null;
			while ((oneLine = br.readLine()) != null) {
				System.out.println(oneLine);
			}
			br.close();
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
