
Feature: Login Feature
Scenario Outline: Login Fail - possible combinations
Given User is on Application landing page
When user click on sign in button
Then User is displayed login screen
When User enter "<UserName>" in username field
And User enter "<Password>" in Password field
And User clicks signIN button
Then User gets login failed error messages
   Examples:
            | UserName          | Password          |
            | Incorrectusername | 123456            |
            | Gaurav						| Incorrectpassword |
            | Incorrectusername | Incorrectpassword |