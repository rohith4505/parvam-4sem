package com.jdbcconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class insertintuser {
	public static void Insertintoemp(String username,String password ) {
		


String sql = "SELECT * FROM users WHERE username=? AND password=?";




		try(Connection conn = DBconnectiomn.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);){

				ps.setString(1, username);
				ps.setString(2, password);
				ResultSet rs = ps.executeQuery();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Insertintoemp("murali","aiml");
		Insertintoemp("pradeep","aiml");
		Insertintoemp("krishnai","aiml");
		
	}

}
   
