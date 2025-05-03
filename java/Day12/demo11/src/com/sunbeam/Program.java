package com.sunbeam;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the srcPath : ");
		String srcPath = sc.next(); 
		File file = new File(srcPath); 
		
		if(!file.exists()) {
			System.out.println("File not exists");
			System.exit(0);
		}
		if(file.isDirectory()) {
			String[] listing = file.list(); 
			for (String ls : listing) {
				System.out.println(ls.toString());
			}
		}
		else if(file.isFile()) {
			System.out.println("Name : "+file.getName());
			System.out.println("Parent : "+file.getParent());
			
			System.out.println("Permissions : ");
			if(file.canRead())
				System.out.print("Read permission, ");
			if(file.canWrite())
				System.out.print("Write permission , ");
			if(file.canExecute())
				System.out.println("Execute permission");
			
			long lastMod = file.lastModified(); 
			System.out.println("Last modified : "+ new Date(lastMod));
		}
		else {
			System.out.println("Niether file nor directory");
		}
			
	}

}




