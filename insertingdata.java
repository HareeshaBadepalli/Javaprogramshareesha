package com.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertingdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String url="jdbc:mysql://localhost:3306/hareeshworld";
			String username="root";
			String password="Hareesh@4464";
			String query="insert into student values(1,'rohit'),(2,'mohit'),(3,'ankit')";
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded");
			try {
				Connection con=DriverManager.getConnection(url,username,password);
				System.out.println("connection is established"+con);
				Statement stmt=con.createStatement();
                stmt.execute(query);
                System.out.println("query is executed");
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
