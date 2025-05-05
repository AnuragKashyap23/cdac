package com.sunbeam;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.Scanner;

public class Program {
	public static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver"; 
	public static final String DB_URl = "jdbc:mysql://localhost:3306/test"; 
	public static final String DB_USER = "root";
	public static final String DB_PASSWORD = "manager";
	
	static {
		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in); 	
		try(Connection con = DriverManager.getConnection(DB_URl, DB_USER, DB_PASSWORD)){
		   String sql = "CALL sp_getmarks(?,?)"; 
		   try(CallableStatement stmt = con.prepareCall(sql)){
			   System.out.print("Enter the roll : ");
			   int roll = sc.nextInt(); 
			   stmt.setInt(1, roll);
			   stmt.registerOutParameter(2, Types.DOUBLE);
			   stmt.execute();
			   double marks = stmt.getDouble(2); 
			   System.out.println("Marks : "+marks);
		   }//stmt.close(); 
	   }//con.close(); 
	   catch (Exception e) {
		   e.printStackTrace();
	}
	}

}
