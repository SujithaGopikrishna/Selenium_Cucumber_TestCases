Feature: Shein

Scenario: Task to shop for cloths in shein website

Given Launchapp https://www.shein.in/
And Mouseover on Clothing and click Jeans
And Choose Black under Jeans product count
And check size as medium
And Click + in color
And check whether the color is black
And Click first item to Add to Bag 
And Click the size as M abd click Submit
And Click view Bag 
When Check the size is Medium or not
Then Close the browser means sheinapplication
