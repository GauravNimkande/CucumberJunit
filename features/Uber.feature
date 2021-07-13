Feature: Uber booking feature
@Smoke
Scenario: Booking Cab Sedan
Given User want to select a car type "sedan" from uber app 
When User select car as "sedan" and pick up point "Bangalor" and drop location "Pune"
Then Driver sarts the journey
And Driver ends the journey
Then user pays 1000 USD

@Regrassion
Scenario: Booking Cab SUV
Given User want to select a car type "SUV" from uber app 
When User select car as "sedan" and pick up point "Bangalor" and drop location "Hydrabad"
Then Driver sarts the journey
And Driver ends the journey
Then user pays 2000 USD

@Prod
Scenario: Booking Cab mini
Given User want to select a car type "mini" from uber app 
When User select car as "sedan" and pick up point "pune" and drop location "Mumbai"
Then Driver sarts the journey
And Driver ends the journey
Then user pays 3000 USD

