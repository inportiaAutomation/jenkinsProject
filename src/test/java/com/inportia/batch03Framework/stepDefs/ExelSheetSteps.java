package com.inportia.batch03Framework.stepDefs;

import com.inportia.batch03Framework.utils.ExcelManager;

import cucumber.api.java.en.Given;

public class ExelSheetSteps {

	ExcelManager exmanager = new ExcelManager("ExcelData\\inportiaData.xlsx");
	

@Given("^print the useranme \"([^\"]*)\"$")
public void print_the_useranme(String arg1) throws Throwable {
	
	System.out.println(exmanager.getValue(arg1));
}

@Given("^print the password \"([^\"]*)\"$")
public void print_the_password(String arg1) throws Throwable {
	System.out.println(exmanager.getValue(arg1));
	}


@Given("^print the pageurl \"([^\"]*)\"$")
public void print_the_pageurl(String arg1) throws Throwable {
	System.out.println(exmanager.getValue(arg1));
}

}
