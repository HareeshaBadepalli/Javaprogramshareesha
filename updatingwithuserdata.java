package com.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class updatingwithuserdata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/hareeshworld";
				String username="root";
				String password="Hareesh@4464";
				Scanner sc=new Scanner(System.in);
				System.out.println("enter the id");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("enter the salary");
				int salary=sc.nextInt();
				String query="update employee set salary=? where id=?";
				
				try {
					Connection con=DriverManager.getConnection(url,username,password);
					System.out.println("connection is established"+con);
					PreparedStatement pstmt=con.prepareStatement(query);
					pstmt.setInt(2, id);
					pstmt.setInt(1, salary);
	                pstmt.executeUpdate();
	                System.out.println("query is executed");
				} 
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
	          }
				
			catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
