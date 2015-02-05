package com.SQL.test;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;

import com.Excel.test.SQLconnectionCommon;
import com.SQL.comm.DataBaseDriver;
import com.SQL.page.pagefactory;

public class TestServer extends SQLconnectionCommon{

	
	
		@BeforeSuite
		public void setUp(){
			openBrowser();
			openURL("http://107.170.213.234/catalog/index.php");
		}
	
	
		@AfterSuite
		public void tearDown(){
			closeBrowser();
		}
		
	
		
		
		
		@Test
		public void LoginAndCheckDatabase() throws SQLException{
		//log in
		pagefactory L=PageFactory.initElements((WebDriver) driver, pagefactory.class);
//		L.clikLogYourSelfIn();
//		L.enterUserName("hayulegacy@gmail.com");
//		L.enterPassword("123456789");
//		L.clickSignInButton();
//		
//		//buy product
//		L.BuyProduct();
		
		//Connect To Database
		DataBaseDriver DB=new DataBaseDriver();
		ResultSet rs=DB.readDatabases("products_name", "orders_products");	
		
			System.out.println(rs);
			rs.last();
			String result=rs.getString("products_name");
			String test=L.productName();
			Assert.assertEquals(result, test, null);
		
		
		
		}
		

	
	
	
	
	
	
}
