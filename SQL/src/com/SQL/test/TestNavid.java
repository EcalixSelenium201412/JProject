package com.SQL.test;



	import java.sql.DriverManager;
import java.sql.ResultSet;

	import org.apache.http.auth.UsernamePasswordCredentials;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.Excel.test.SQLconnectionCommon;
import com.SQL.comm.DataBaseDriver;
import com.SQL.page.pagefactory;



	public class TestNavid extends SQLconnectionCommon {

		DataBaseDriver dataDriver = new DataBaseDriver();
		ResultSet set = dataDriver.readDatabases("test.accounts");
		
		@BeforeMethod
		public void setUp(){
			openBrowser();
			openURL("http://107.170.213.234/catalog/index.php");
			
			
		}
		
		@Test
		public void testLogin01()  throws Exception{
			pagefactory loginPageFactory=PageFactory.initElements((WebDriver) driver, pagefactory.class);
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
			pagefactory loginPageFactory=PageFactory.initElements((WebDriver) driver, pagefactory.class);
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

