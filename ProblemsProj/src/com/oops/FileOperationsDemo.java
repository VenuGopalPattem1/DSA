package com.oops;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileOperationsDemo {
	public static void main(String[] args) throws Exception {
		/*
		 * FileWriter fw=new FileWriter("venu.txt"); fw.write("java is awesome");
		 * fw.write("\n"); fw.write("i need a job"); fw.close();
		 */
		FileReader fr=new FileReader("venu.txt");
		BufferedReader br=new  BufferedReader(fr);
		String s=br.readLine();
		while(s!=null) {
			System.out.println(s);
			s=br.readLine();
		}
		fr.close();
		br.close();
	}
}
