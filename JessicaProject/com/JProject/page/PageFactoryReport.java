package com.JProject.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.JProject.comm.Common;

public class PageFactoryReport extends Common{
	@FindBy (how=How.LINK_TEXT, using="Reports")
	private WebElement Reports;
	
    @FindBy (how=How.LINK_TEXT,using="Stock Report")
    private WebElement Stock_Report;
	
    @FindBy (how=How.XPATH,using="/html/body/table/tbody/tr[3]/td/center/fieldset/table")
    private WebElement table;
	
    public void openTable(){
    	MouseOver(Reports,Stock_Report);
    		
    }
    
    public void printTable(){
    	
    	List<WebElement> rows=table.findElements(By.tagName("tr"));
        for(WebElement r : rows)
        {
       	 int x=1;
       	 List<WebElement> cols=r.findElements(By.tagName("td"));
       	 for(WebElement c : cols)
       	 {
       		 if(x==1)
       		 {
       		 System.out.println(c.getText());
       		 }
       		 x++;
       	 }
       	 System.out.println("-----");
       	 
        }
    	
    	
    	
    	
    }
    
	
	
}
