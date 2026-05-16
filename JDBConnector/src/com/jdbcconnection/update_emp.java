package com.jdbcconnection;

import java.sql.Connection;
import java.sql.Statement;

public class update_emp {
	public static void  update_emp(String name,String dept,double salary ) {
		
		String sql = "UPDATE emp2 SET name = 'punith' where id=2;";
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
		update_emp("murali","aiml",250000);
		update_emp("pradeep","aiml",50000);
		update_emp("krishnai","aiml",250000);
		
		
	}

}
   
