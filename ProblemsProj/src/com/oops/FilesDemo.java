package com.oops;

import java.io.File;

public class FilesDemo {
	public static void main(String[] args) throws Exception {
		/*
		 * File f=new File("venu"); boolean status=f.mkdir();
		 * System.out.println(status);
		 */
		
		File f1=new File("C:\\Users\\venuv");
		String[] s=f1.list();
		for(String h:s) {
			File ff=new File(f1, h);
			if(ff.isFile())
				System.out.println("file :"+h);
			if(ff.isDirectory())
				System.out.println("directory :"+h);

		}
	}
}
