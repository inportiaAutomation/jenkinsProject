package com.inportia.batch03Framework.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ClickCheckboxPage extends BasePage {
        
	
	By bmw_chk = By.id("bmwcheck");
	By benz_chk = By.id("benzcheck");
	By honda_chk = By.id("hondacheck");
	
	public ClickCheckboxPage()
	{
		
	}
	   
	
	    public  WebElement get_checkbox(String option)
	    {
	    	
	    
	    	WebElement checkbox = null;
	    	if(option.equalsIgnoreCase("BMW")){
	    		checkbox = driver.findElement(bmw_chk);
	    		
	    	}
	    	else if (option.equalsIgnoreCase("HONDA")){
	    		checkbox = driver.findElement(honda_chk);
	    		
	    	}
	    	else if (option.equalsIgnoreCase("BENZ")){ 
	    		checkbox = driver.findElement(benz_chk);
	    	}
	    	else{
	    		checkbox = driver.findElement(benz_chk) ;
	    		
	    	}
	    	return checkbox;
	    	
	    
	    }
	
	    public void select_inclusive_checkbox(String option)
	    {
	    	WebElement checkbox;
	    	
	    	
	    		if(option.equalsIgnoreCase("BMW")){
	    		checkbox = driver.findElement(bmw_chk);
	    		if(!checkbox.isSelected())
	    		  checkbox.click();
	    		}
	    		else if (option.equalsIgnoreCase("HONDA")){
	    		checkbox = driver.findElement(honda_chk);
	    		if(!checkbox.isSelected())
		    		  checkbox.click();
	    		}
	    		else if (option.equalsIgnoreCase("BENZ")){
	    		checkbox = driver.findElement(benz_chk);
	    		if(!checkbox.isSelected())
		    		  checkbox.click();
	    		}
	    
	    }
	    
	    
	    public void select_all_checkboxes()
	    {
	    	
	    }
	    
	    public void select_exclusive_checkbox(String option)
	    {
	    	
	    }
	    
	    public void deseletc_all_checkboxes()
	    {
	    	deselect("BMW");
	    	deselect("HONDA");
	    	deselect("BENZ");
	    	
	    }
	    
	    public void deselect(String option)
	    {
	    	WebElement elm = get_checkbox(option);
	    	if(elm.isSelected())
	    	{
	    		elm.click();
	    	}
	    }
	    
	    
}
