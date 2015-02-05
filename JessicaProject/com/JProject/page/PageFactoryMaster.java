package com.JProject.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.JProject.comm.Common;

public class PageFactoryMaster extends Common{
	@FindBy (how=How.LINK_TEXT, using="Master")
	private WebElement Master;
	
    @FindBy (how=How.LINK_TEXT,using="Search/Edit")
    private WebElement Search;
	
    @FindBy (how=How.NAME,using="InGroup")
    private WebElement InGroup;
	
	public void openList(){
		MouseOver(Master,Search);
		
	}
	
	public void printList(){
		
		List<WebElement> lst = InGroup.findElements(By.tagName("option"));
		 for (WebElement w:lst){
			 System.out.println(w.getText());
		
			 
		}
		
	}
	
	
}
