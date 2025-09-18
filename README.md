# Garrett's popcorn vending machine

Garrett's popcorn is looking to launch a vending machine that sells their world renowned popcorn.  The vending machine will contain a total of 9 products. 
The products are listed below in the chart along with purchase price.  To select an item, the end-user will enter the product row along with the column letter.
The program should enforce that only product row numbers and column letters can be entered. The end-user will be able to continously select up to  as they would 
like until they enter a sentinel value.
   

At the conclusion of selecting all items, the program will display the total number of items purchased and the total cost.

**Hints**
- Make use of two dimensional arrays.
- Consider parallel arrays



Your program should operate similarly to the program shown in the .gif below
The .gif below show three iterations of running the program

![Alt text](https://instructorc.github.io/site/slides/java/images/ds/prog4_output.gif "Program 4 Execution Example")

**YOU MUST MAKE USE MULTI-DIMENSIONAL ARRAY(S) FOR THIS PROGAM**

| Product Row | Column P               | Column N                       | Column R           |
|-------------|------------------------|--------------------------------|--------------------|
| 0           | Garrett Mix ($14.99)   |  Pecan Carmel Crisp ($10.99)   | Plain ($6.99)      |
| 1           | Caramel Crisp ($16.99) |  Cashew Carmel Crisp ($9.99)   | Buttery ($8.99     |
| 2           | Cheese Corn ($12.99)   |  Almond Carmel Crisp ($11.99)  | Sweet Corn ($7.99) |                           




*** Listed below is a list of requirements that need to be completed for your program

## Requirement 1 (5 Points)
Variables are properly declared and initialized; Use of Scanner Object to read input from console. Make use of constant final variables. 
Whenever possible, make sure to declare all variables that will hold data along with declaring final variables that will not change during runtime.
Proper structure used for allowing the end-user to continously enter new items until they enter a sentinel value that indicates they are finished

## Requirement 2 (5 Points) 
Input/Output of all necessary information for each item entry; Program properly makes use of arrays/multi-dimensional arrays to structure data;
Program restricts the use of the row numbers and column characters shown in chart (Validating Data). Program displays each item and cost for each iteration.

## Requirement 3 (5 Points)
At the conclusion of all entries, the program provides a 1)Total number of items selected and  2) Total price of all items

## Requirement 4 (5 Points)
Style - Proper use of comments, spacing, in program; use of descriptive variable names

## Requirement 5 (5 Points)
Program is submitted by the due date listed and pushed to assigned GitHub Repository; Repository contains a minimum of three commits.

## Extra Credit (2 Points)
Include logic that takes into account the stock level of each product.  Assume that each product is stocked with a maximum of 5 items.  When the stock-level for a product reaches below 3, an additional message will output under the Summary of Items Purchased notifying the end-use of how many items have requested new products along with the vendor purchase cost.  Assume the vendor purchase the product at 50% of retail price.  See example output below for what will output if Pecan Carmel Crisp has 2 item left and Cheese Corn has 1 item left.

## Sample output below:
```
Summary of Items Purchased
*****************************
7 items purchased for a total cost of $88.93

*****************************
Item(s) sent for Restock
   - 3 Pecan Carmel Crisp (Restock cost: $16.49)
   - 4 Cheese Corn (Restock cost: $51.96)
```

## Submission Instructions for Program 4
For Program 4, you will need to submit two items:

1. **The GitHub URL to your Repository.**
   - Your code should be reflected in the assigned GitHub repository provided to you by the instructor.  In Sakai, you will need to submit the link to your repository by the due date and time listed in the write-up. Make sure you receive confirmation from Sakai that your assignment has been submitted.

2. **A recording of you explaining each line of your code.**
   - You can use any recording tool of your choice, or opt for a free resource like [RecordScreen.io](https://recordscreen.io).
   - The video doesn't need to be lengthy; just briefly walk through each line of your code.
   - Save the recorded file to your computer and, for convenience, upload it to your school-issued Office 365 OneDrive account at [office.com](https://www.office.com).
   - Paste the link to your recording in the assignment comments.


