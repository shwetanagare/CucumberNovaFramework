package com.Nova.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Nova.pages.LoginPage;
import com.Nova.pages.PageObjectManager;
import com.Nova.pages.StartPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepdefinition extends PageObjectManager {
	
	public WebDriver driver;
	
	@Before
	public void getScenario(Scenario scenario)
	{
		 initiation();
		
		 TCName = scenario.getName();
		 logger = extent.createTest(TCName);
		
		 
	}
	
	@After
	public void savereport()
	{
		extent.flush();
	}

	
	@Given("user should be on login page")
	public void user_should_be_on_login_page() {
		if(driver==null)
			launchApp();
		   getPageObject();
	    
	}

	
	@When("user enters valid username and valid password and click on login button")
	public void user_enters_valid_username_and_valid_password_and_click_on_login_button() {
		lp.login(td.get(TCName).get("Userid"), td.get(TCName).get("Password"));
	}
	@Then("User should be navigated to home page")
	public void user_should_be_navigated_to_home_page() throws InterruptedException {
		
		sp.Homepage();
		
	}

	

}
