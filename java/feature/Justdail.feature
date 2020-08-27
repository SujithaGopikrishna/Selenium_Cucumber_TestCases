Feature: Justdail

Scenario: Task
Given Launch https://www.justdial.com/
And Cick on Air Tickets 
And Type Chennai and choose Chennai
And Type Toronto and select Toronto
And Set Departure
And Add AdulttwoChildrenone click and Search
And Select Air Canada from multi-airline itineraries
And Click on Price to sort the result
And Click on +Details of first result under Price
And Capture the Flight Arrival times 
And Capture the total price in a list and Click on Book
When Capture the Airport name base on the list of time
Then Captur the total fare and print the difference amount from previous total price
