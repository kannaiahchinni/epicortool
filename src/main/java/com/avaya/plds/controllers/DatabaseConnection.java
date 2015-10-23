package com.avaya.plds.controllers;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
	
	
	public void testConnection(){
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection dbConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/signinevents","karunakar","karunakar");
			if(dbConn != null){
					System.out.println("Connection created ....");
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		new DatabaseConnection().testConnection();
	}

}
