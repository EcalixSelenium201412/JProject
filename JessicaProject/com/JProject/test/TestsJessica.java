package com.JProject.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import com.JProject.comm.Common;
import com.JProject.page.PageFactoryBrand;
import com.JProject.page.PageFactoryLogin;
import com.JProject.page.PageFactoryMaster;
import com.JProject.page.PageFactoryMobileTransact;
import com.JProject.page.PageFactoryRegistre;
import com.JProject.page.PageFactoryReport;

public class TestsJessica extends Common{


	
	
	@BeforeSuite
	public void SetUp(){
	openBrowser();
	GoToUrl();
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}


	
	@Test(priority=1)
	public void LogInToTheNewWebsite(){
	System.out.println("First");
	PageFactoryLogin P=PageFactory.initElements(driver, PageFactoryLogin.class);  
	P.Login();
		
	}



	@Test(priority=2)
	public void CreateNewUser(){
	    System.out.println("Second");
	    PageFactoryMobileTransact M=PageFactory.initElements(driver, PageFactoryMobileTransact.class);  
		M.Create1();
	
		PageFactoryRegistre R=PageFactory.initElements(driver, PageFactoryRegistre.class);  
		R.Create2();
		
		  Alert alert = driver.switchTo().alert();
	      alert.accept();
	}

	@Test(priority=3)
	public void CreateBrand(){
		
		PageFactoryBrand B=PageFactory.initElements(driver, PageFactoryBrand.class); 
		B.Create3();
		
		Alert alert = driver.switchTo().alert();
	    alert.accept();
		
	}
	
	@Test(priority=4)
	public void GetTable(){
		PageFactoryReport Re=PageFactory.initElements(driver, PageFactoryReport.class); 
		Re.openTable();
		Re.printTable();
	}

	@Test(priority=5)
	public void GetList(){
		PageFactoryMaster Ma=PageFactory.initElements(driver, PageFactoryMaster.class); 
		Ma.openList();
		Ma.printList();
	}




	@AfterSuite
	public void TearDown(){		
		closeBrowser();
		}



}
