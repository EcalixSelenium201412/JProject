package com.JProject.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.JProject.comm.Common;

public class PageFactoryMobileTransact extends Common {
	
	@FindBy (how=How.XPATH, using=".//*[@id='MenuBar1']/li[4]/a")
	private WebElement Preference;
	
    @FindBy (how=How.XPATH,using=".//*[@id='MenuBar1']/li[4]/ul/li[1]/a")
    private WebElement NewUser;
	

	
	public void Create1(){		

		
//		   System.out.println("Create1");
//           System.out.println(driver.getCurrentUrl());		
		   Actions action = new Actions(driver);
		   action.moveToElement(Preference).build().perform();
		   
		   try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   
		 
		   action.moveToElement(NewUser).click().build().perform();	
		   
		 
		   System.out.println("Create 1 completed"); 
		
		
	}
	
	
	
	
	
	
}
