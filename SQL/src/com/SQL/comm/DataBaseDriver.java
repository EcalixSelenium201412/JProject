package com.SQL.comm;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class DataBaseDriver {
	


		private Connection connect = null;
		
		private Statement statement = null;              
//		private PreparedStatement preparedstatement = null ;
		private ResultSet resultSet = null;
		public ResultSet readDatabases(String entryname, String nameOfTable) {
		try { 
        
		Class.forName("com.mysql.jdbc.Driver");     // to the jdbc jar file
		connect= DriverManager.getConnection("jdbc:mysql://107.170.213.234/itech" , "qatester","qatester");     //how to  	  	
		//SSH connection, connection string 
		System.out.println("we are connected to the server");
		
		
		statement = connect.createStatement();        //execute the exact command 
		resultSet= statement.executeQuery("select"+ entryname + "from" + nameOfTable);
		
		
		
		} catch(Exception e) {
			System.out.println("Something is wrong");
			e.printStackTrace();
		}
	return resultSet;
		}
			
	}


