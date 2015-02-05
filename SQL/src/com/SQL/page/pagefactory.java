package com.SQL.page;


	

	import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.Excel.test.SQLconnectionCommon;

	public class pagefactory extends SQLconnectionCommon{

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
		    
		    @FindBy(how=How.XPATH, using="//*[@id='bodyContent']/div/div[2]/table/tbody/tr[3]/td[2]/a[2]")
		    private WebElement Product;
		    
		    @FindBy(how=How.XPATH, using="//*[@id='tdb5']/span[2]")
		    private WebElement AddToCart;
		    
		    @FindBy(how=How.XPATH, using="//*[@id='tdb6']/span[1]")
		    private WebElement Checkout;

		    @FindBy(how=How.XPATH, using="//*[@id='tdb6']/span[2]")
		    private WebElement Continue;
		    
		    @FindBy(how=How.XPATH, using="//*[@id='bodyContent']/form/div/div[4]/table[1]/tbody/tr/td[2]/input")
		    private WebElement COD;
		    
		    @FindBy(how=How.XPATH, using="//*[@id='tdb5']/span[2]")
		    private WebElement Confirm;
		    
		    public void BuyProduct(){
		    	Product.click();
		    	AddToCart.click();
		    	Checkout.click();
		    	Continue.click();
		    	COD.click();
		    	Continue.click();
		    	Confirm.click();
		    }
		
	
			public String productName(){
				return Product.getText();
			}
		  
		    
		    
		    
		   
		   
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



