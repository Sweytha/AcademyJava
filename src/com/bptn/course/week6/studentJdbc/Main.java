package com.bptn.course.week6.studentJdbc;

import java.sql.Connection;

public class Main {

	public static void main(String[] args) {
		
		StudentAppClass jdbc = new StudentAppClass();
		Connection conn= jdbc.createConnection(); //created the connection
		jdbc.getAllStudents(conn);  //executed the sql query
		jdbc.getStudentById(conn, 16);
		jdbc.addStudent(conn, 2, "Bob Smith", "bob@example.com", "123456");
		jdbc.closeConnection(conn);//close the connection

	}

}
