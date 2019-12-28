Feature: To perform create lead scenario

Background:
Given To launch the browser
And maximize the browser
And Load the URL

Scenario Outline: To perform create lead positive scenario with mandatory field
Given Enter the username as <username>
And Enter the password as <password>
And click the login 
And click crmsfa link
And click leads tab
And click create lead button
And Enter the company name as TATA
And Enter the First name as Hari
And Enter the last name as Saha
When click the create lead button
Then Verify create lead is perfomrmed successfully

Examples: 
|username||password|
|demosalesmanager||crmsfa|
|demoCSR||crmsfa|