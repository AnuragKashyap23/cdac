package com.sunbeam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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
	
	/*
		A ResultSet cursor is initially positioned before the first row; 
		the first call to the method next makes the first row the current row; 
		the second call makes the second row the current row, 
		and so on. 
	*/
	public static void main(String[] args) {
		try(Connection con = DriverManager.getConnection(DB_URl, DB_USER, DB_PASSWORD)){
			//Creates a Statement object for sendingSQL statements to the database
			try(Statement stmt = con.createStatement()){
				String sql = "SELECT * FROM students"; 
				try(ResultSet rs = stmt.executeQuery(sql)){
					while(rs.next()) {
						int roll = rs.getInt("roll"); 
						String name = rs.getString("name"); 
						double marks = rs.getDouble("marks");
						System.out.println(roll + "," + name + "," + marks);
					}
				}//rs.close(); 
			}//stmt.close(); 
		}//con.close(); 
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}



