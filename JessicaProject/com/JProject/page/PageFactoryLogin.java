package com.JProject.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.JProject.comm.Common;

public class PageFactoryLogin extends Common{
	@FindBy (how=How.NAME, using="UserType")
	private WebElement UserType;
	
    @FindBy (how=How.NAME,using="UserName")
    private WebElement UserName;
	
    @FindBy (how=How.NAME,using="PassWord")
	private WebElement Password;
    
    @FindBy (how=How.NAME,using="Login")
 	private WebElement Login;
    
    
    public void Login(){
    	
 DropDown(UserType, "Administrator");
 UserName.sendKeys("shah");
 Password.sendKeys("shah123");
 Login.click();
    	
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
