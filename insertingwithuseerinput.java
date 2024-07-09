package com.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class insertingwithuseerinput {

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
			System.out.println("enter the name");
			String name=sc.nextLine();
			System.out.println("enter the salary");
			int salary=sc.nextInt();
			String query="insert into employee values(?,?,?)";
			
			try {
				Connection con=DriverManager.getConnection(url,username,password);
				System.out.println("connection is established"+con);
				PreparedStatement pstmt=con.prepareStatement(query);
				pstmt.setInt(1, id);
				pstmt.setString(2,name);
				pstmt.setInt(3, salary);
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
