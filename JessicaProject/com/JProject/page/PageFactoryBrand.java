package com.JProject.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.JProject.comm.Common;

public class PageFactoryBrand extends Common{

	@FindBy (how=How.XPATH, using="//*[@id='MenuBar1']/li[1]/a")
	private WebElement Master;
	
    @FindBy (how=How.XPATH,using="//*[@id='MenuBar1']/li[1]/ul/li[1]/a")
    private WebElement NewBrand;
	
    @FindBy (how=How.ID,using="BrandName")
    private WebElement BrandName;
    
    @FindBy (how=How.NAME,using="Desc")
    private WebElement Desc;
    
    @FindBy (how=How.NAME,using="Save")
    private WebElement Save;
    
	public void Create3(){
		
		MouseOver(Master,NewBrand);
		BrandName.sendKeys("Babak");
		Desc.sendKeys("Roomate");
		Save.click();
		
		
	}
    
    
    
    
	
}
