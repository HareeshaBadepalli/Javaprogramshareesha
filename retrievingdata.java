package com.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class retrievingdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String url="jdbc:mysql://localhost:3306/hareeshworld";
			String username="root";
			String password="Hareesh@4464";
			String query="select *from student";
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver is loaded");
			try {
				Connection con=DriverManager.getConnection(url,username,password);
				System.out.println("connection is established"+con);
				Statement stmt=con.createStatement();
                ResultSet rs=stmt.executeQuery(query);
                while(rs.next()) {
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
                }				
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
