package com.Nova.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Nova.utilities.CommonActions;
import com.aventstack.extentreports.ExtentTest;

public class LoginPage extends CommonActions{


       
       public LoginPage(WebDriver driver,ExtentTest logger)
       {
    	   super(driver,logger);
    	   //this.logger = logger;
    	   PageFactory.initElements(driver,this);
    	
       }
		@FindBy(name="loginfmt")
		WebElement tb_loginfirsttab;		
		
		@FindBy(xpath="//input[@type='submit']")
		WebElement tb_Submit1;
		
		@FindBy(xpath="//input[@type='submit']")
		WebElement tb_Submit2;
		
		@FindBy(xpath="//input[@type=\"password\"]")
		WebElement tb_Password;
		
		@FindBy(xpath="//input[@value='Verify']")
		WebElement tb_Verify;
		
		@FindBy(xpath="//input[@id=\"idSIButton9\"]")
		WebElement tb_Button;

		public void login(String userid,String pwd)
		{
			 type(tb_loginfirsttab,userid,userid+" has been entered into username field");
		
			 click(tb_Submit1,"Login button clicked successfully");
		
			 click(tb_Submit2,"click sucessfully");
		
	         type(tb_Password,pwd,pwd+" has been enter into password field");
			 
			 click(tb_Verify,"verify sucessfully");
			 
	         click(tb_Button,"Login button clicked successfully");
			
		}
		
       }
	

