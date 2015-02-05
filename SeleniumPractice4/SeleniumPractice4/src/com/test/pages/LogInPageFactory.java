package com.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.ecalix.common.Common;

public class LogInPageFactory extends Common {

	 @FindBy(how = How.NAME, using = "email_address")
	    private WebElement EMAILADDRESS;
	    
	    @FindBy(how = How.NAME, using = "password")
	    private WebElement PASSWORD;
	    
	    @FindBy(how = How.XPATH, using = "//*[@id='tdb5']/span[1]")
	    private WebElement SIGNIN;
	    
	    @FindBy(how = How.XPATH, using = ".//*[@id='bodyContent']/div/div[1]/a[1]/u")
	    private WebElement LOGYOURSELFIN;
	    
	    @FindBy(how = How.XPATH, using = "//*[@id='tdb4']/span")
	    private WebElement LOGOFF;
	    public void enterUserName(String username){
			EMAILADDRESS.sendKeys(username);
			System.out.println("Email address entered");
		
		}
		
		public void enterPassword(String password){
			PASSWORD.sendKeys(password); 
			System.out.println("Password  entered");
		}
		
		public void clickSignInButton(){	   
			SIGNIN.click();
			System.out.println("Sign In Clicked");
		}
			public void clikLogYourSelfIn(){
				LOGYOURSELFIN.click();
				Assert.assertTrue(IsTextPresent("Welcome, Please Sign In"));
			}
			public void clickLogOff(){
				  LOGOFF.click();
			}
	
	
	
}


