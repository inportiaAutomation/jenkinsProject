package com.inportia.batch03Framework.stepDefs;



import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import com.inportia.batch03Framework.utils.BrowserManager;





public class Hooks {
    
	static WebDriver driver;
	
	@Before
	public static void createSingletonBrowser(String bname) throws MalformedURLException
	{
		System.out.println("inside before method");
		driver =  BrowserManager.getBrowser(bname);
	}
	
	public static WebDriver getBrowser(String bname)
	{
		if(driver!=null)
		{
			return driver;
		}
		return null;
	}
	
	@After
	public static void closeBrowser()
	{
		
	}
	
}
