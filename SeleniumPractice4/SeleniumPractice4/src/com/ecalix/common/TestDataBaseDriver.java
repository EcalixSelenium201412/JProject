package com.ecalix.common;

import java.sql.ResultSet;

public class TestDataBaseDriver {
	
	public static void main (String[] args) throws Exception {
	
	DataBaseDriver testDriver = new DataBaseDriver();
	ResultSet set = testDriver.readDatabases("test.accounts");
	
	
	while(set.next()) {

		String username = set.getString("username");
		String password = set.getString("password");
		System.out.println("username:"+ username);
		System.out.println("password:"+ password);	
}
}
}
