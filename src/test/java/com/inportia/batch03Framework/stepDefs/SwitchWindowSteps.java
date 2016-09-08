package com.inportia.batch03Framework.stepDefs;

import org.openqa.selenium.By;

import com.inportia.batch03Framework.pageObjects.SwitchWindow;

import cucumber.api.java.en.Given;

public class SwitchWindowSteps{
   

	SwitchWindow wind = new SwitchWindow();
	
	@Given("^click on open window buttons$")
	public void click_on_open_window_buttons() throws Throwable {
		wind.click_window_open_button();
	}

	@Given("^verify if openned window have correct url$")
	public void verify_if_openned_window_have_correct_url() throws Throwable {
        wind.switch_to_second_window();
	}

	@Given("^verify if the content is present in openned window$")
	public void verify_if_the_content_is_present_in_openned_window() throws Throwable {
        wind.verify_if_second_present();
	}
}
