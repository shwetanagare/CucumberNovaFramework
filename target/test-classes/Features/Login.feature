Feature: Login Functionality

//Background: 
//Given user should be on login page

//@test
//Scenario Outline: valid Login
Scenario: TestCase1_ValidLogin
Given user should be on login page
When user enters valid username and valid password and click on login button
Then User should be navigated to home page


