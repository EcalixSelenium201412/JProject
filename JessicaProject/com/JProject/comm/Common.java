package com.JProject.comm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Common {
public static WebDriver driver;
String URL="http://www.crossoverlearning.com/Apps/MobileTransact/Login.php";


public void openBrowser(){
	
    driver=new FirefoxDriver();
    driver.manage().window().maximize();
	System.out.println("open Firefox");

}
	

public void closeBrowser(){
	
	driver.manage().deleteAllCookies();
	driver.quit();
	System.out.println("close FF");
}
	
	
public void GoToUrl(){
	
	driver.get(URL);
	
	
}	
	



	public void DropDown(WebElement dropdown, String Select){
		Select dropdownselect = new Select(dropdown);
		System.out.println("Drop Down Selected");
		dropdownselect.selectByVisibleText(Select);
		System.out.println("Element Selected");
	
	}


	public void MouseOver(WebElement parent, WebElement child){
		   Actions action = new Actions(driver);
		   action.moveToElement(parent).build().perform();
		   try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   action.moveToElement(child).click().build().perform();
			
		
	}
}

