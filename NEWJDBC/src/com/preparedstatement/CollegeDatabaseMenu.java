package com.preparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CollegeDatabaseMenu {

    // 1. INSERT STUDENT
    public static void insertStudent(Connection con, Scanner sc) throws SQLException {

        System.out.print("  Student Name : ");
        String name = sc.nextLine();

        System.out.print("  Course       : ");
        String course = sc.nextLine();

        System.out.print("  Marks        : ");
        double marks = Double.parseDouble(sc.nextLine());

        String sql = "INSERT INTO student (name, course, marks) VALUES (?, ?, ?)";

        try (PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setString(2, course);
            ps.setDouble(3, marks);

            System.out.println("  Rows inserted : " + ps.executeUpdate());
        }
    }

    // 2. VIEW ALL STUDENTS
    public static void viewAllStudents(Connection con) throws SQLException {

        String sql = "SELECT * FROM student ORDER BY id";

        try (PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            System.out.printf("%n  %-5s %-20s %-15s %s%n",
                    "ID", "Name", "Course", "Marks");

            System.out.println("  " + "-".repeat(55));

            boolean any = false;

            while (rs.next()) {

                any = true;

                System.out.printf("  %-5d %-20s %-15s %.2f%n",
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("course"),
                        rs.getDouble("marks"));
            }

            if (!any) {
                System.out.println("  No records found.");
            }
        }
    }

    // 3. SEARCH STUDENT BY ID
    public static void searchStudentById(Connection con, Scanner sc)
            throws SQLException {

        System.out.print("  Enter Student ID : ");
        int id = Integer.parseInt(sc.nextLine());

        String sql = "SELECT * FROM student WHERE id = ?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {

                    System.out.printf(
                            "%n  ID:%d  Name:%s  Course:%s  Marks:%.2f%n",
                            rs.getInt("id"),
                            rs.getString("name"),
                            rs.getString("course"),
                            rs.getDouble("marks"));

                } else {
                    System.out.println("  Student not found.");
                }
            }
        }
    }

    // 4. UPDATE STUDENT
    public static void updateStudent(Connection con, Scanner sc)
            throws SQLException {

        System.out.print("  Enter ID to update : ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("  New Name           : ");
        String name = sc.nextLine();

        System.out.print("  New Course         : ");
        String course = sc.nextLine();

        System.out.print("  New Marks          : ");
        double marks = Double.parseDouble(sc.nextLine());

        String sql =
                "UPDATE student SET name=?, course=?, marks=? WHERE id=?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setString(2, course);
            ps.setDouble(3, marks);
            ps.setInt(4, id);

            System.out.println(
                    ps.executeUpdate() > 0
                            ? "  Student Updated!"
                            : "  Student Not Found."
            );
        }
    }

    // 5. DELETE STUDENT
    public static void deleteStudent(Connection con, Scanner sc)
            throws SQLException {

        System.out.print("  Enter ID to delete : ");
        int id = Integer.parseInt(sc.nextLine());

        String sql = "DELETE FROM student WHERE id=?";

        try (PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            System.out.println(
                    ps.executeUpdate() > 0
                            ? "  Student Deleted!"
                            : "  Student Not Found."
            );
        }
    }

    // 6. MAIN METHOD
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try (Connection con = DBconnection.getConnection()) {

            System.out.println("  Database Connected!");

            int choice;

            do {

                System.out.println("\n");
                System.out.println(" ===== COLLEGE DATABASE MANAGEMENT =====");
                System.out.println(" 1. Insert Student");
                System.out.println(" 2. View All Students");
                System.out.println(" 3. Search Student by ID");
                System.out.println(" 4. Update Student");
                System.out.println(" 5. Delete Student");
                System.out.println(" 6. Exit");

                System.out.print(" Enter your choice : ");

                choice = Integer.parseInt(sc.nextLine());

                switch (choice) {

                    case 1:
                        insertStudent(con, sc);
                        break;

                    case 2:
                        viewAllStudents(con);
                        break;

                    case 3:
                        searchStudentById(con, sc);
                        break;

                    case 4:
                        updateStudent(con, sc);
                        break;

                    case 5:
                        deleteStudent(con, sc);
                        break;

                    case 6:
                        System.out.println("  Goodbye!");
                        break;

                    default:
                        System.out.println("  Invalid choice. Enter 1-6.");
                }

            } while (choice != 6);

        } catch (SQLException e) {

            System.err.println("  Database Error : " + e.getMessage());

        }

        sc.close();
    }
}