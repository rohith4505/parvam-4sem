package com.jdbcconnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Fetch_emp {

    public static void fetchEmp() {

        String sql = "SELECT * FROM emp2";

        try (Connection conn = DBconnectiomn.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                String dept = rs.getString("dept");
                double salary = rs.getDouble("salary");

                System.out.println("ID      : " + id);
                System.out.println("Name    : " + name);
                System.out.println("Dept    : " + dept);
                System.out.println("Salary  : " + salary);
                System.out.println("-------------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        fetchEmp();

    }
}