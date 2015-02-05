package com.JProject.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.JProject.comm.Common;

public class PageFactoryRegistre extends Common {

	@FindBy (how=How.NAME, using="UserType")
	private WebElement UserType;
	
    @FindBy (how=How.NAME,using="UserName")
    private WebElement UserName;
    
    @FindBy (how=How.NAME,using="Name")
    private WebElement Name;
	
    @FindBy (how=How.NAME,using="PassWord1")
	private WebElement Password;
    
    
    @FindBy (how=How.NAME,using="PassWord2")
  	private WebElement RePassword;
      
    
    @FindBy (how=How.NAME,using="Save")
 	private WebElement Save;

	public void Create2(){
		
		DropDown(UserType,"User");
		Name.sendKeys("Peter Haoshen Yu");
		UserName.sendKeys("hayu");
		Password.sendKeys("hayu123");
		RePassword.sendKeys("hayu123");
		Save.click();
		
		
		
		
		
	}
	
	
	
	
}

