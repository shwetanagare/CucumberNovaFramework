package com.Nova.pages;

import org.openqa.selenium.WebDriver;

import com.Nova.stepdefinitions.BaseStepDefinition;

public class PageObjectManager extends BaseStepDefinition {
		
		public LoginPage lp;
		public StartPage sp;
		
		
		public void getPageObject()
		{
			
			if(lp==null)
			{
				lp = new LoginPage(driver,logger);
			}
				
			if(sp==null)
			{
				sp = new StartPage(driver,logger);
			}
		}

	}


