package com.ecommerce.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

import com.ecommerce.pages.page1; 

public class test {
	public page1 CM;


	@BeforeTest
	public void setUp(){
		CM=new page1();
		CM.openBrowser();
		CM.openURL();
		
	}
	
	@AfterTest
	public void back(){
	CM.back();
	}
	
//	@Test
//	public void LoginTest01(){
//		CM.ClickAndLogIn();
//		CM.Login();
//		CM.logOff();
//		
//		
//}
//	@Test
//	public void DropdownListTest02(){
//
//		
//		CM.selectDropDown("select","4");
//		CM.pause();
//	
//	}
//	
//	@Test
//	public void CreateAccount(){
//	CM.createAccount();
//		
//	}
	
	
//	@Test
//	public void ShopTest03(){
//		
//		CM.Shop();
//		
//	}
	
	@Test
	public void SearchCheck04(){	
		CM.CheckSearch();
	}
	
	
	
	
	
	@AfterMethod
	public void close(){
		CM.closeBrowser();		
	}
}
