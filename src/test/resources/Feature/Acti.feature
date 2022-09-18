Feature: Verify login functionality
Scenario Outline: Login using valid data
Given Open the browser
And User on login page
When User enter <UN> and <PWD>
And Click on login btn
Then User should navigate on home page


Examples:
         |UN|PWD|
         |admin|manager|