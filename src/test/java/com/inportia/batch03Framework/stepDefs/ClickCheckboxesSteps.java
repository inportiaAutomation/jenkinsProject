package com.inportia.batch03Framework.stepDefs;

import com.inportia.batch03Framework.pageObjects.ClickCheckboxPage;

import cucumber.api.java.en.Given;

public class ClickCheckboxesSteps {
   
	ClickCheckboxPage chk_page = new ClickCheckboxPage();
	
	
	@Given("^select \"([^\"]*)\" checkbox$")
	public void select_checkbox(String arg1) throws Throwable {
	   chk_page.select_inclusive_checkbox(arg1);
	}
	
	@Given("^close the browser$")
	public void close_the_browser() throws Throwable {
		chk_page.close_browser();
	} 
	
	@Given("^deselect all the checkboxes$")
	public void deselect_all_the_checkboxes() throws Throwable {
	    chk_page.deseletc_all_checkboxes();
	}
}
