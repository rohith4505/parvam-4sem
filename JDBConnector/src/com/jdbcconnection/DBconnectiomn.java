package com.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnectiomn {
	 static String url = "jdbc:mysql://localhost:3306/rohith1";
	 static String user ="root";
	static String password = "root";
	public static Connection getConnection() throws SQLException{
		Connection connection= DriverManager.getConnection(url, user, password);
		return connection;
		
	}

}
