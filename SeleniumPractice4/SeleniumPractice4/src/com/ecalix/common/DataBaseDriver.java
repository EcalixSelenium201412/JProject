package com.ecalix.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseDriver {
	private Connection connect = null;
	
	private Statement statement = null;
//	private PreparedStatement preparedstatement = null ;
	private ResultSet resultSet = null;
	public ResultSet readDatabases(String nameOfTable) {
	try { 

	Class.forName("com.mysql.jdbc.Driver");
	connect= DriverManager.getConnection("jdbc:mysql://localhost/test?" + "root", null);
	System.out.println("we are connected to the server");
	
	
	statement = connect.createStatement();
	resultSet= statement.executeQuery("select * from " + nameOfTable);
	
	
	
	} catch(Exception e) {
		System.out.println("Something is wrong");
		e.printStackTrace();
	}
return resultSet;
	}
		
}
