
Feature: User Registration
Scenario: user registration with different data
Given User is on registration page
When user enter following user details
  | Gaurav | Nimkande | gaurav@gmail.com | 99999 |
     | Raj | Abc | Raj@gmail.com | 88888 |
Then User registration should be sucessful


Scenario: user registration with different data With Column
Given User is on registration page
When user enter following user details with column
    | Name | Lastname | EmailID | MobileNo |
  | Gaurav | Nimkande | gaurav@gmail.com | 99999 |
     | Raj | Abc | Raj@gmail.com | 88888 |
Then User registration should be sucessful