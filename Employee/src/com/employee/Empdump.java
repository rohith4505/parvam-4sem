package com.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Empdump{
	 static String url = "jdbc:mysql://localhost:3306/batchbd";
	 static String user ="root";
	static String password = "root";
	public static Connection  getConnection() throws SQLException{
		Connection connection = DriverManager.getConnection(url, user, password);
		return connection;
	}

}
