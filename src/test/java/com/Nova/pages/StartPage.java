package com.Nova.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.Nova.utilities.CommonActions;
import com.aventstack.extentreports.ExtentTest;

public class StartPage extends CommonActions {
	
	  public StartPage(WebDriver driver, ExtentTest logger) {
		super(driver, logger);
		// TODO Auto-generated constructor stub
	}
	
      
		@FindBy(xpath="//div[@class='ScreenHeader_title__22nlV ScreenHeader_text__190dq']")
		WebElement txt_StartHomesites;	
		
		public void Homepage()
		{
			CheckDisplay(txt_StartHomesites,"txt present on homepage");
		}
		

}
