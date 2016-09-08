package com.inportia.batch03Framework.pageObjects;

import org.openqa.selenium.By;


public class LayerOne extends BasePage {
      
	
	   String url = "https://letskodeit.teachable.com/pages/practice";
	   By radiobox_benz = By.id("benzradio");
	   By radiobox_bmw = By.id("bmwradio");
	   By radiobox_honda = By.id("hondaradio");
		  
	
	  public LayerOne() {
		super();
		
	  }
	  
	  public void open_traget_page()
	  {
		  driver.get(url);
	  }
 
	
	  public void select_radio_button(String option)
	  {
		if (option.equalsIgnoreCase("HONDA")){
		    	 driver.findElement(radiobox_benz).click();
			 }
		    	 else if (option.equalsIgnoreCase("HONDA")){
		    	 driver.findElement(radiobox_benz).click();
		    	 }
		    	 else if (option.equalsIgnoreCase("HONDA")){
		    	 driver.findElement(radiobox_benz).click();
		    	 }
		    	 else{
		         driver.findElement(radiobox_benz).click();
		    	 }
		 
	  }
	  
	  public void close_browser()
	  {
		  //Hooks.closeBrowser();
	  }
	  
	  
}
