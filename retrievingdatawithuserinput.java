package com.jdbcpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class retrievingdatawithuserinput {

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
				String query="select *from employee where id=?";
				try {
					Connection con=DriverManager.getConnection(url,username,password);
					System.out.println("connection is established"+con);
					PreparedStatement pstmt=con.prepareStatement(query);
					pstmt.setInt(1, id);
					
	                ResultSet rs=pstmt.executeQuery();
	                while(rs.next()) {
	                	System.out.println(rs.getInt(1)+ " "+rs.getString(2)+" "+rs.getInt(3));
	                }
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
