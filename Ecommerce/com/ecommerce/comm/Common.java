package com.ecommerce.comm;

import java.io.File;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;


public class Common {
public WebDriver driver;
public String baseURL="http://107.170.213.234/catalog/";

//open the browser
public void openBrowser(){
	
	DesiredCapabilities Capabilities = new DesiredCapabilities();

	File chromedriver = new File("E:\\STUDY\\job\\selenium\\driver\\chromedriver.exe");

	System.setProperty("webdriver.chrome.driver", chromedriver.getAbsolutePath());

	Capabilities = DesiredCapabilities.chrome();

	Capabilities.setCapability("chrome.switches", Arrays.asList("--start-maximized"));


	driver = new ChromeDriver(Capabilities);
	System.out.println("open Chrome");

}

public void closeBrowser(){
	
	driver.manage().deleteAllCookies();
	driver.quit();
	System.out.println("close Chrome");
}
	
public void openURL(){
	driver.get(baseURL);
	System.out.println("open URL");
}	
	

public void back(){
	driver.findElement(By.xpath("//*[@id='storeLogo']/a/img")).click();
	
}


public void selectDropDown(String TagName, String value){
	
	Select dropdownselect = new Select(driver.findElement(By.tagName(TagName)));
	System.out.println("Drop Down Selected");
	dropdownselect.selectByValue(value);
	System.out.println("Element Selected");
}


public void DropDown (String xpath, String text ){
	
	Select dropdownselect = new Select(driver.findElement(By.xpath(xpath)));
	System.out.println("Drop Down Selected");
	dropdownselect.deselectByVisibleText(text);
	System.out.println("Element Selected");

	
}



public void pause(){
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
}


public void click(String xpath){
	driver.findElement(By.xpath(xpath)).click();
	System.out.println("clicked");
	

}


public void enter(String xpath, String value){
driver.findElement(By.xpath(xpath)).sendKeys(value);
System.out.println(value);

}


public void clickInvisible(String xpath){
	WebElement tmpElement= driver.findElement(By.xpath(xpath));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();",tmpElement);
}




}
