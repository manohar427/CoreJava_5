package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnectionManager {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/repairman", "root",
					"Tester@123");
			System.out.println("Connection:" + con);

			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("Select * from users");

			while (rs.next()) {
				System.out.println(rs.getString("user_id") + ":"
						+ rs.getString("username") + ":"
						+ rs.getString("password") + ":"
						+ rs.getString("email"));
			}

			// Second table data
			String query = "select * from student order by studentAddress asc";
			ResultSet rs1 = stmt.executeQuery(query);

			System.out.println("Student data:");

			while (rs1.next()) {
				System.out.println(rs1.getString("studentid") + ":"
						+ rs1.getString("courceid") + ":"
						+ rs1.getString("studentname") + ":"
						+ rs1.getString("studentAddress"));
			}
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//hjhj
		
	}

}
