package com.ecommerce.pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.ecommerce.comm.Common;

public class page1 extends Common {
	
	
	
	public void ClickAndLogIn(){
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/a[1]/u")).click();
		System.out.println("Log yourself in");
		
	}

	public void Login(){
		driver.findElement(By.name("email_address")).sendKeys("ecalix@test.com");
		driver.findElement(By.name("password")).sendKeys("test123");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/p[2]/span/button")).click();
		VerifyTitle("iBusiness"); //good habit to check;
		System.out.println("log In Clicked");
		
		
	}

	@SuppressWarnings("deprecation")
	private void VerifyTitle(String sTitle){
		String title=driver.getTitle();
		Assert.assertEquals(sTitle,title);
		System.out.println("Verified");
		
	}

	public void logOff(){
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/span[4]/a/span")).click();
		System.out.println("Exit");
	}


	public void createAccount(){
		click("//*[@id='bodyContent']/div/div[1]/a[2]/u");      //Create
	    click("//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]");// radio button male
		enter("//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[2]/td[2]/input","QA Peter");
		enter("//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[3]/td[2]/input","Yu");
		
		
		
	    click("//*[@id='dob']");
		DropDown("//*[@id='ui-datepicker-div']/div/div/select[1]", "Oct");
	    DropDown("//*[@id='ui-datepicker-div']/div/div/select[2]", "2001");
		click("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[5]/a");
	
	
		
		
		
		enter("//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[5]/td[2]/input", "hayulegacy@gmail.com");
		
		enter("//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[1]/td[2]/input", "4234 Hacienda Dr");
		enter("//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[3]/td[2]/input","94588");
		enter("//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[4]/td[2]/input", "Pleasanton");
		enter("//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[5]/td[2]/input", "CA");
		selectDropDown("select", "223");
		enter("//*[@id='bodyContent']/form/div/div[5]/table/tbody/tr[1]/td[2]/input","3108259498");
		enter("//*[@id='bodyContent']/form/div/div[6]/table/tbody/tr[1]/td[2]/input", "123456789");
	    enter("//*[@id='bodyContent']/form/div/div[6]/table/tbody/tr[2]/td[2]/input", "123456789");
		
	    click("//*[@id='tdb4']/span[2]");
	
	   System.out.println("Success");
		
			
			
		
	}

	
	public void Shop(){
		
		ClickAndLogIn();
		Login();
		enter("//*[@id='columnLeft']/div[3]/div[2]/form/input[1]","speed");
		
		//(JavascriptExecutor(driver)).executeScript("driver.findElement(By.xpath(//*[@id='columnLeft']/div[3]/div[2]/form/input[2])).click();");
		//click("//*[@id='columnLeft']/div[3]/div[2]/form/input[2]");
		//click("//*[@id='columnLeft']/div[3]/div[2]/form/input[3]");
		//clickInvisible("//*[@id='columnLeft']/div[3]/div[2]/form/input[3]");
		
		driver.findElement(By.xpath("//*[@id='columnLeft']/div[3]/div[2]/form/input[1]")).sendKeys(Keys.RETURN);
		
		
		//buy
		click("//*[@id='tdb6']/span[2]");
		driver.findElement(By.xpath("//*[@id='columnLeft']/div[3]/div[2]/form/input[1]")).sendKeys(Keys.RETURN);	
		//clickInvisible("//*[@id='columnLeft']/div[3]/div[2]/form/input[2]");
		//buy
		click("//*[@id='tdb7']/span[2]");
		//cancel
	    click("//*[@id='bodyContent']/form/div/div[1]/table/tbody/tr[2]/td[1]/table/tbody/tr/td[2]/a[2]");
	    click("//*[@id='tdb6']/span[2]");
	    //change address
	    click("//*[@id='tdb5']/span[2]");

	    click("//*[@id='bodyContent']/form/div/div[6]/table/tbody/tr[1]/td[2]/input[2]");
	    enter("//*[@id='bodyContent']/form/div/div[6]/table/tbody/tr[3]/td[2]/input","Jessica");
	    enter("//*[@id='bodyContent']/form/div/div[6]/table/tbody/tr[2]/td[2]/input","Chopra");
	    enter("//*[@id='bodyContent']/form/div/div[6]/table/tbody/tr[5]/td[2]/input","Herhome Ave");       
	    enter("//*[@id='bodyContent']/form/div/div[6]/table/tbody/tr[7]/td[2]/input","94568");
	    enter("//*[@id='bodyContent']/form/div/div[6]/table/tbody/tr[8]/td[2]/input","Dublin");
	    enter("//*[@id='bodyContent']/form/div/div[6]/table/tbody/tr[9]/td[2]/input","CA");
	    click("//*[@id='tdb5']");
	    enter("//*[@id='bodyContent']/form/div/div[5]/textarea","Ramesh: Jessica told me to do the shop but its just clicking and entering, please give us some assighments");
	    click("//*[@id='tdb6']/span[2]");
	   // next page
	    click("//*[@id='bodyContent']/form/div/div[4]/table[1]/tbody/tr/td[2]/input");
	    
	   // confirm
	    click("//*[@id='tdb5']/span[2]");
	    click("//*[@id='tdb5']");
	   	}



	public void CheckSearch(){	
		enter("//*[@id='columnLeft']/div[3]/div[2]/form/input[1]","Beloved");
		click("//*[@id='columnLeft']/div[3]/div[2]/form/input[4]");
	
	}






}
