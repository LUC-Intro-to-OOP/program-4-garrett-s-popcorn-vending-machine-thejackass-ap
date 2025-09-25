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
      
    String[][] names = {
        {"Garrett Mix        ", "   Pecan Carmel Crisp   ", " Plain         "},
        {"Caramel Crisp      ", "   Cashew Carmel Crisp  ", " Buttery       "},
        {"Cheese Corn        ", "   Almond Carmel Crisp  ", " Sweet Corn    "}
        };

    double[][] prices = {
        {14.99, 10.99, 6.99},
        {16.99, 9.99, 8.99},
        {12.99, 11.99, 7.99}
    };

    int totalItems = 0;
    double totalCost = 0.0;
    int row = 0;

    Scanner scn = new Scanner(System.in);


    while (row != -1) {

        System.out.println("\nWelcome to the Garrett's Popcorn Vending Machine!\n");
        System.out.println("Row   Column P              Column N              Column R");
        
        for (int i = 0; i < products.length; i++) {
            System.out.println(i + "\t" + products[i][0] + "\t\t" + products[i][1] + "\t\t" + products[i][2]); 
        }
        System.out.println("Listed above are items you can select.");

        System.out.println("Please enter row of desired product or enter -1 to EXIT: ");
        row = Integer.parseInt(scn.nextLine());

        if 





        while (row!= != -1 && (row < 0 || row > 2)) {
            System.out.print("Invalid Entry, Please enter row of desired product: ");
            row = Integer.parseInt(scn.nextLine());
        }
    }
    

    }//END OF MAIN

}
