package com.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbc_connection4 {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/rohith1";
			String user ="root";
			String password = "root";
			Connection connection= DriverManager.getConnection(url, user, password);
			
			System.out.println("connection sucessful");
			System.out.println(connection.getCatalog());
			//create statement
			Statement st = connection.createStatement();
			//execute
			String sql = "create table emp2("
					+ "id int primary key auto_increment,"
					+ "name varchar(20),"
					+ "dept varchar(25),"
					+ "salary double(10,2))";
			int executeUpdate = st.executeUpdate(sql);
			System.out.println("sucessful :"+executeUpdate+"effected");
//			ResultSet executeQuery = st.executeQuery(sql);
//			//display
//			while(executeQuery.next()) {
//				System.out.println("id: "+executeQuery.getInt("id")+"| name:"+executeQuery.getString("name")+" | email: "+executeQuery.getString("email"));
//			}
			
			connection.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
