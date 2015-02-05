package com.SQL.test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import com.Excel.test.Common;
import com.Excel.test.DataDriveXLS;
import com.SQL.page.pagefactoryExcel;




public class TestExcel extends Common {

	
public static String Filename=	"C:\\Users\\Haoshen\\Desktop\\Login.xlsx";
public static DataDriveXLS DDX=new DataDriveXLS(Filename);	
public String Username;
public String Password;
	
	
@BeforeMethod
	public void SetUp(){
		openBrowser();
		openURL();
		
	}
	
@AfterMethod
	public void TearDown(){
		closeBrowser();
	}

@Test
	public void ExcelLoginTest01(){
	pagefactoryExcel E=PageFactory.initElements(driver, pagefactoryExcel.class);
	E.clikLogYourSelfIn();
	
	//System.out.println(DDX.getRowCount("Sheet1"));
	
	Username=DDX.getCellData("Sheet1", 0,2);
	Password=DDX.getCellData("Sheet1", 1,2);
	
	//System.out.println(Username);
	//System.out.println(Password);
		
	E.enterUserName(Username);
	E.enterPassword(Password);
	E.clickSignInButton();
	E.clickLogOff();
	back();
	}

@Test
	public void ExcelLoginTest02(){

	pagefactoryExcel E=PageFactory.initElements(driver, pagefactoryExcel.class);
	E.clikLogYourSelfIn();
	
	//System.out.println(DDX.getRowCount("Sheet1"));
	
	Username=DDX.getCellData("Sheet1","ID",3);
	Password=DDX.getCellData("Sheet1","Pwd",3);
	
	//System.out.println(Username);
	//System.out.println(Password);
		
	E.enterUserName(Username);
	E.enterPassword(Password);
	E.clickSignInButton();
	E.clickLogOff();
	back();
	}



	
	
	
	
}
