package com.inportia.batch03Framework;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions 
(
		features = "Feature",
		glue = "com/inportia/batch03Framework/stepDefs",
		tags = "@chk_01,@chk_02,@chk_03"
)
public class App 
{
   
//	@Before
//	public  void test_setup()
//	{
//		System.out.println("Setup has been called...");
//	}
//	
//	@After
//	public  void test_cleanup()
//	{
//		System.out.println("Break down has been called...");
//	}
   
}
