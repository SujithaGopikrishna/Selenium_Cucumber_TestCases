Feature: BigBasket

Scenario: Task to purchase the source of fresh juice


Given Go to https://www.bigbasket.com/
And mouse over on  Shop by Category 
And Go to Beverages and Fruit juices & Drinks
And Click on JUICES
And click Tropicana and Real under Brand
And Check count of the products from each Brands and total count
And Check whether the products is availabe with Add button.
And Add the First listed available product 
And click on Change Address 
And Select CHennai as City, Alandur-600016,Chennai as Area  and click Continue
And Mouse over on My Basket print the product name. count and price.
When Click View Basker and Checkout
Then Click the close button and close the browser