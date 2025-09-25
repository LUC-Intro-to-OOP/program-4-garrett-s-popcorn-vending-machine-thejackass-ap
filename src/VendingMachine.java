/**
 * Garrett's popcorn vending machine

Garrett's popcorn is looking to launch a vending machine that sells their world renowned popcorn.  The vending machine will contain a total of 9 products. 
The products are listed below in the chart along with purchase price.  To select an item, the end-user will enter the product row along with the column letter.
The program should enforce that only product row numbers and column letters can be entered. The end-user will be able to continously select up to  as they would 
like until they enter a sentinel value.
   

At the conslusion of selecting all items, the program will display the total number of items purchased and the total cost.

**Hints**
- Make use of two dimensional arrays.
- Consider parallel arrays



Your program should operate similarly to the program shown in the .gif below
The .gif below show three iterations of running the program

![Alt text](https://instructorc.github.io/site/slides/java/images/ds/program_4_sample_output.gif "Program 4 Execution Example")



| Product Row | Column P               | Column N                       | Column R           |
|-------------|------------------------|-----------------------------------------------------|
| 0           | Garrett Mix ($14.99)   |  Pecan Carmel Crisp ($10.99)   | Plain ($6.99)      |
| 1           | Caramel Crisp ($16.99) |  Cashew Carmel Crisp ($9.99)   | Buttery ($8.99     |
| 2           | Cheese Corn ($12.99)   |  Almond Carmel Crisp ($11.99)  | Sweet Corn ($7.99)  


 */

import java.util.Scanner; //Import the Scanner Class
public class VendingMachine {
    public static void main(String[] args) throws Exception {
      
    String[][] products = {
        {"Garrett Mix  ", "Pecan Carmel Crisp", "Plain    "},
        {"Caramel Crisp", "Cashew Carmel Crisp", "Buttery       "},
        {"Cheese Corn  ", "Almond Carmel Crisp", "Sweet Corn    "}
        };

    double[][] prices = {
        {14.99, 10.99, 6.99},
        {16.99, 9.99, 8.99},
        {12.99, 11.99, 7.99}
    };

    int totalItems = 0;                                                         //declared and initiliazed all variables 
    double totalCost = 0.0;
    int row = 0;
    String column;
    int col = -1;

    Scanner scn = new Scanner(System.in);
    System.out.println("Welcome to the Garrett's Popcorn Vending Machine!");


    while (row != -1) {    
        System.out.println();      
        System.out.println("Row\tColumn P\t\tColumn N\t\t\tColumn R");
        System.out.println("0\t" + products[0][0] + "\t\t" + products[0][1] + "\t\t" + products[0][2]);
        System.out.println("1\t" + products[1][0] + "\t\t" + products[1][1] + "\t\t" + products[1][2]);
        System.out.println("2\t" + products[2][0] + "\t\t" + products[2][1] + "\t\t" + products[2][2]);
        System.out.println("Listed above are items you can select.");

        
        System.out.print("Please enter row of desired product or -1 to EXIT : ");     // ask for row (sentinel = -1)
        row = Integer.parseInt(scn.nextLine());

            
        while (row != -1 && (row < 0 || row > 2)) {                                     // validate row (only 0,1,2 or -1)
            System.out.print("Invalid Entry, Please enter row of desired product: ");
            row = Integer.parseInt(scn.nextLine());
            }

        
        if (row != -1) {                                                               // if not exiting, ask for column
            System.out.print("Please enter column of desired product: ");
            column = scn.nextLine();                                                   

        
            if (column.equals("P")) col = 0;                                  // if-else statements used if proper column entered
            else if (column.equals("N")) col = 1;                             // using 'equals' instead of == since text and not #s
            else if (column.equals("R")) col = 2;

        
            while (col == -1) {                                                       // while loop to validate column until it’s P, N, or R 
                System.out.print("Invalid Entry, Please enter either capital P, N or R of desired product: ");
                column = scn.nextLine();
                if (column.equals("P")) col = 0;
                else if (column.equals("N")) col = 1;
                else if (column.equals("R")) col = 2;
            }

            String itemName = products[row][col];                                     // 2D array of products with rows and columns
            double price = prices[row][col];                                          // 2D array of prices
            System.out.println("You enter selected " + itemName + " for a price of " + price);

            totalItems = totalItems + 1;                                            
            totalCost  = totalCost  + price;
            }
        }

        System.out.println();
        System.out.println("Summary of Items Purchased");
        System.out.println("*****************************");
        System.out.println(totalItems + " items purchased for a total cost of $" + totalCost);
        System.out.println("*****************************");
    }
}//END OF MAIN

