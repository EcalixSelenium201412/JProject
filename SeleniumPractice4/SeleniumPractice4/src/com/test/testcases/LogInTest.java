package com.test.testcases;

import java.sql.DriverManager;
import java.sql.ResultSet;

import org.apache.http.auth.UsernamePasswordCredentials;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecalix.common.Common;
import com.ecalix.common.DataBaseDriver;
import com.test.pages.LogInPageFactory;

public class LogInTest extends Common {

	DataBaseDriver dataDriver = new DataBaseDriver();
	ResultSet set = dataDriver.readDatabases("test.accounts");
	
	@BeforeMethod
	public void setUp(){
		openBrowser();
		openURL("http://107.170.213.234/catalog/index.php");
		
		
	}
	
	@Test
	public void testLogin01()  throws Exception{
		LogInPageFactory loginPageFactory=PageFactory.initElements((WebDriver) driver, LogInPageFactory.class);
		loginPageFactory.clikLogYourSelfIn();
	//	DataBaseDriver dataDriver = new DataBaseDriver();
	//	ResultSet set = dataDriver.readDatabases("test.accounts");
		
		String username;
		String password;
	//	ResultSet set = dataDriver.readDatabases("test.accounts");
		//Thread.sleep(6000);
		set.next();
		username = set.getString("username");
		password = set.getString("password");
		
		System.out.println("username:"+ username);
		System.out.println("password:"+ password);	
		
		
		loginPageFactory.enterUserName(username);
		loginPageFactory.enterPassword(password);
		loginPageFactory.clickSignInButton();
		  
	    Assert.assertTrue(IsTextPresent("Log Off"));
	    loginPageFactory.clickLogOff();
	}
	
	@Test
	public void testLogin02()  throws Exception{
		LogInPageFactory loginPageFactory=PageFactory.initElements((WebDriver) driver, LogInPageFactory.class);
		loginPageFactory.clikLogYourSelfIn();
		
	//	DataBaseDriver dataDriver = new DataBaseDriver();
		String username;
		String password;
		ResultSet set = dataDriver.readDatabases("test.accounts");
		//Thread.sleep(6000);
		set.next();
		set.next();
		username = set.getString("username");
		password = set.getString("password");
		
		System.out.println("username:"+ username);
		System.out.println("password:"+ password);	
		
		
		loginPageFactory.enterUserName(username);
		loginPageFactory.enterPassword(password);
		loginPageFactory.clickSignInButton();
		  
	    Assert.assertTrue(IsTextPresent("Log Off"));
	    loginPageFactory.clickLogOff();
	}
	
	
	@AfterMethod
	public void tearDown(){
		closeBrowser();
}
}