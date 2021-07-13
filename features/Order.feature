Feature: Amazon Order Page
In Order to check my order details 
As a registered user 
i want to specify the features of order details 

Background:
Given a registerd user exist
When User Enter User Name 
And user Enter Password
And User Enter on Login button
Then User navigate to Order Page



Scenario: Check previous order details
When User click on order Link
Then User checks the Previous order details


Scenario: Check Open order details
When User click on Open order Link
Then User checks the Open order details


Scenario: Check Cancelled order details
When User click on Cancel order Link
Then User checks the Cancelled order details

