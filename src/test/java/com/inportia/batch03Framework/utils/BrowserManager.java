package com.inportia.batch03Framework.utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserManager {
   
	private static WebDriver browser;
	private static boolean is_created = false;
	private static String node_url = "http://10.71.71.183:5566/wd/hub";
	
	private BrowserManager()
	{
		
	}
	
	static WebDriver createBrowser(String browser_name) throws MalformedURLException
	{
				if (browser_name.equalsIgnoreCase("Firefox"))
		{
		
			System.setProperty("webdriver.gecko.driver", "C:/workspace/driver/geckodriver-v0.9.0-win64/geckodriver.exe");
			System.setProperty("webdriver.firefox.bin", "C:/workspace/driver/FirefoxPortable/FirefoxPortable.exe");
			browser = new FirefoxDriver(new FirefoxProfile());
			browser.manage().deleteAllCookies();
			browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			browser.manage().window().maximize();
			return browser;
		}
		else if(browser_name.equalsIgnoreCase("RemoteGrid")){
			System.setProperty("webdriver.gecko.driver", "C:/workspace/driver/geckodriver-v0.9.0-win64/geckodriver.exe");
			System.out.println("Connecting to the grid.");
			DesiredCapabilities dcap = DesiredCapabilities.firefox();
			dcap.setBrowserName("firefox");
			dcap.setPlatform(Platform.WIN8_1);
//			FirefoxProfile profile = new FirefoxProfile();
			browser = new RemoteWebDriver(new URL(node_url),dcap);
			return browser;
		}
		else{
			System.out.println("Running the default browser i.e. Firefox.");
			browser = new FirefoxDriver(new FirefoxProfile());
			browser.manage().deleteAllCookies();
			browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			browser.manage().window().maximize();
			return browser;
			
		}
		

		
	}
	
	public static void destroyBrowser()
	{
			try{
				browser.close();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		
	}
	
	public static WebDriver getBrowser(String browserName) throws MalformedURLException
	{
		if (!is_created)
		{
			is_created = true;
			return createBrowser(browserName);
			
		}
		
		return browser;
	}
	
}
