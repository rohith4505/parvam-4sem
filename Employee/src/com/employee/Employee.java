package com.employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Employee {

    // Number of rows per batch
    private static final int BATCH_SIZE = 100;

    public static void loadFromFile(String filePath) {

        // SQL query for emp1 table
        String sql = "INSERT INTO emp1 (ename, eid, contactnum, sal, experience) VALUES (?,?,?,?,?)";

        try (Connection con = Empdump.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            // Disable auto-commit for batch processing
            con.setAutoCommit(false);

            String line;
            int count = 0;
            int total = 0;

            // Skip CSV header
            reader.readLine();

            // Read file line by line
            while ((line = reader.readLine()) != null) {

                // Skip empty lines
                if (line.trim().isEmpty())
                    continue;

                // Split CSV values
                String[] parts = line.split(",");

                // Validate column count
                if (parts.length < 5)
                    continue;

                // Set values into PreparedStatement
                ps.setString(1, parts[0].trim());                 // ename
                ps.setInt(2, Integer.parseInt(parts[1].trim())); // eid
                ps.setString(3, parts[2].trim());                // contactnum
                ps.setDouble(4, Double.parseDouble(parts[3].trim())); // sal
                ps.setInt(5, Integer.parseInt(parts[4].trim())); // experience

                // Add to batch
                ps.addBatch();
                count++;
                total++;

                // Execute batch when size reached
                if (count == BATCH_SIZE) {
                    ps.executeBatch();
                    ps.clearBatch();

                    System.out.println("Inserted " + total + " rows so far...");
                    count = 0;
                }
            }

            // Execute remaining rows
            if (count > 0) {
                ps.executeBatch();
                ps.clearBatch();
            }

            // Commit transaction
            con.commit();

            System.out.println("✅ Done! Total rows inserted: " + total);

        } catch (SQLException e) {
            System.err.println("❌ DB Error: " + e.getMessage());
            e.printStackTrace();

        } catch (IOException e) {
            System.err.println("❌ File Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        System.out.println("=== JDBC Batch Processing Demo ===");
        System.out.println("Starting file read and batch insert...");

        // CSV file path
        String filePath = "emp1.csv";

        // Load CSV data into emp1 table
        loadFromFile(filePath);

        System.out.println("=== Program Complete ===");
    }
} 
