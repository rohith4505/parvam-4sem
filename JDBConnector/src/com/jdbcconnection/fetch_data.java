package com.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class fetch_data {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/rohith1";
			String user ="root";
			String password = "root";
			Connection connection= DriverManager.getConnection(url, user, password);
			
			System.out.println("connection sucessfl");
			System.out.println(connection.getCatalog());
			//create statement
			Statement st = connection.createStatement();
			//execute
			String sql = "select * from emp2";
			ResultSet executeQuery = st.executeQuery(sql);
			//display
			while(executeQuery.next()) {
				System.out.println("id: "+executeQuery.getInt("id")+"| name:"+executeQuery.getString("name")+" | dept: "+executeQuery.getString("dept"));
			}
			connection.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

