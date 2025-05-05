package com.sunbeam;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

public class Program {

	public static void main1(String[] args) {
		try(FileWriter fw = new FileWriter("File1.txt")){
			fw.write("Sunbeam Info Hinjewadi");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void main(String[] args) {
		try(FileOutputStream fout = new FileOutputStream("File1.txt")){
			try(OutputStreamWriter ow = new OutputStreamWriter(fout)){
				ow.write("Sunbeam Info");
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
