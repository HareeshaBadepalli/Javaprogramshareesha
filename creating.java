package com.jdbcpractice;

import java.sql.*;

public class creating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			String url="jdbc:mysql://localhost:3306/hareeshworld";
			String username="root";
			String password="Hareesh@4464";
			String query="create table student(roll int,name varchar(10))";
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
