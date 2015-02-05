package com.ecalix.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common {
	
public static WebDriver driver;
	
	public void openBrowser(){
		driver=new FirefoxDriver();
	
	System.out.println("FireFox Browser opened");
	}
		
		
	public void openURL(String sURL){
		driver.get(sURL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	public void closeBrowser(){
		driver.quit();
	}
	
	public boolean IsTextPresent(String textToBeVerified)
	{
	try
	 {
		if (driver.findElement(By.xpath("//*[contains(.,'" + textToBeVerified + "')]")) != null)
			{
		return true;
			}
		} catch (Exception e)
	       {
			return false;
	        }

		return false;
	 }

}
