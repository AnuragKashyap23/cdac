package com.sunbeam;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.SortedMap;

public class Program {
	
	public static void main1(String[] args) {
		int data; 
		try(FileReader rd = new FileReader("File1.txt")){
			while((data = rd.read())!=-1) {
				System.out.print((char)data);
			}
		}//rd.close(); 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		int data; 
		try(FileInputStream fin = new FileInputStream("File1.txt")){
		   try(InputStreamReader rd = new InputStreamReader(fin)){
			   while((data = rd.read())!=-1) {
				   System.out.print((char)data);
			   }
		   }//rd.close(); 
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
