package com.inportia.batch03Framework.pageObjects;

import org.openqa.selenium.WebDriver;


import com.inportia.batch03Framework.utils.BrowserManager;

public class BasePage {
    
	   public WebDriver driver;
	
	   public BasePage()
	   {
		   try
		   {
		     driver = BrowserManager.getBrowser("Firefox");
		   }
		   catch(Exception ex)
		   {
			   ex.printStackTrace();
		   }
	   }
	   
	   public void close_browser(){
		   BrowserManager.destroyBrowser();
	   }
}
