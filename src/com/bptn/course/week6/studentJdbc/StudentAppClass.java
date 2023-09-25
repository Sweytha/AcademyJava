package com.bptn.course.week6.studentJdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentAppClass {

	// create all the variables to store the details of Postgres database
	// variables- userName, password, dbName, port, dbUrl

	private static final String userName = "postgres";
	private static final String password = "pg123";
	private static final String dbName = "postgres"; // just check your dbName for "students" and "courses" table
	private static final String port = "5432";
	private static final String dbUrl = "localhost";

	// create a connection
	public Connection createConnection() {
		Connection conn = null;

		try {

			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection("jdbc:postgresql://" + dbUrl + ":" + port + "/" + dbName, userName,
					password);

		} catch (Exception e) {
			System.out.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}

		System.out.println("Opened database connection successfully");
		return conn;

	}

	// define a function which will get all students from "students" table
	public void getAllStudents(Connection conn) {

		try {

			Statement stmt = null;
			stmt = conn.createStatement();

			// create a sql statement to select all students from the students table in the
			// database
			String sql = "SELECT * from students";
			// execute the query and get the ResultSet object
			ResultSet rs = stmt.executeQuery(sql);
			// print the results onto the console
			while (rs.next()) {
				// retrieve by column name
				System.out.print("Student ID: " + rs.getInt("studentId"));
				System.out.print(", Course ID: " + rs.getInt("courseId"));
				System.out.print(", Student Name: " + rs.getString("studentName"));
				System.out.print(", Student Email: " + rs.getString("studentEmail"));
				System.out.println(", Student Phone: " + rs.getString("studentPhone"));

			}

			// close the statement
			stmt.close();

		} catch (SQLException ex) {
			System.out.println("Exception:" + ex.getMessage());
		}
	}

	// getStudentById-- get the student record by Id
	public void getStudentById(Connection conn, int studentId) {

		try {
			PreparedStatement stmt = null;
			String sql = "SELECT * FROM students WHERE \"studentId\"= ?";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, studentId);

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				// retrieve by column name
				System.out.print("Student ID: " + rs.getInt("studentId"));
				System.out.print(", Course ID: " + rs.getInt("courseId"));
				System.out.print(", Student Name: " + rs.getString("studentName"));
				System.out.print(", Student Email: " + rs.getString("studentEmail"));
				System.out.println(", Student Phone: " + rs.getString("studentPhone"));
			}

			// close the statement
			stmt.close();

		} catch (SQLException ex) {
			System.out.println("Exception:" + ex.getMessage());
		}

	}

	// add a new student record to the students table
	public void addStudent(Connection conn, int courseId, String studentName, String studentEmail,
			String studentPhone) {

		try {
			PreparedStatement stmt = null;
			String sql = "INSERT into students(\"courseId\", \"studentName\",\"studentEmail\", \"studentPhone\") VALUES(?,?,?,?)";
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, courseId);
			stmt.setString(2, studentName);
			stmt.setString(3, studentEmail);
			stmt.setString(4, studentPhone);

			int resultCount = stmt.executeUpdate();
			System.out.println(resultCount + " record(s) inserted");
			stmt.close();
		} catch (SQLException ex) {
			System.out.println("Exception:" + ex.getMessage());
		}
	}

	// close to connection
	public boolean closeConnection(Connection conn) {

		boolean flag = true;
		try {
			conn.close();
		} catch (SQLException ex) {
			flag = false;
			System.out.println("Exception: " + ex.getMessage());
		}
		return flag;

	}

}
