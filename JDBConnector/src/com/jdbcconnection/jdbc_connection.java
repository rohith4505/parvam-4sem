package com.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbc_connection {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/college";
			String user ="root";
			String password = "root";
			Connection connection= DriverManager.getConnection(url, user, password);
			
			System.out.println("connection sucessfl");
			System.out.println(connection.getCatalog());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
