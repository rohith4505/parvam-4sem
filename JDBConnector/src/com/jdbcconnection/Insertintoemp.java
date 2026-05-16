package com.jdbcconnection;

import java.sql.Connection;
import java.sql.Statement;

public class Insertintoemp {
	public static void Insertintoemp(String name,String dept,double salary ) {
		

		String sql = "INSERT INTO emp2(name, dept, salary) VALUES ('"
				            + name + "', '"
				            + dept + "', "
				            + salary + ")";
		try(Connection conn = DBconnectiomn.getConnection();
				Statement st =conn.createStatement()){
			int rows = st.executeUpdate(sql);
			System.out.println(rows+" is affected");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Insertintoemp("murali","aiml",250000);
		Insertintoemp("pradeep","aiml",50000);
		Insertintoemp("krishnai","aiml",250000);
		
	}

}
   
