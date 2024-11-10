package com.tutorialsninja.automation.stepdef;

import com.tutorialsninja.automation.base.Base;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register {
	@Given("^I lanuch the applaction$")
	public void i_lanuch_the_applaction()  {
	    Base.driver.get(Base.reader.getUrl());
	    
	}

	@Given("^I navigate to Account Registration page$")
	public void i_navigate_to_Account_Registration_page()  {
	    
	    
	}

	@When("^I provide all the below valid details$")
	public void i_provide_all_the_below_valid_details(DataTable datatable)  {
	    
	   
	}

	@When("^I select th Privacy Policy$")
	public void i_select_th_Privacy_Policy() {
	    
	   
	}

	@When("^I click on continue Button$")
	public void i_click_on_continue_Button()  {
	    
	    
	}

	@Then("^I should see that the User Account has successfuly created$")
	public void i_should_see_that_the_User_Account_has_successfuly_created()   {
	 
	    
	}


}
