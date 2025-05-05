package com.sunbeam;

import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;
import java.util.SortedMap;

public class Program {
	
	public static void main(String[] args) {
		 try(FileWriter fw = new FileWriter("File1.txt")){
			fw.write("Sunbeam Hinjewadi...");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
