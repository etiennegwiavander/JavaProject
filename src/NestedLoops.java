import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args){
        // It is also possible to place a loop inside another loop. This is called a nested loop.
        // The "inner loop" will be executed one time for each iteration of the "outer loop".
        // Let's create a program that allows users to set the number of rows and columns and draw a rectangle of a symbol that the user inputs.
        
        // Explanation:

        // Import Scanner: We import the Scanner class to get user input.
        // Prompt User: The code prompts the user to enter a symbol, height, and width for the rectangle.
        // Nested for Loops:
        // The outer loop (i) iterates for the number of rows (height).
        // The inner loop (j) iterates for the number of columns (width).
        // Inside the inner loop, the symbol is printed using System.out.print.
        // Newline after Each Row: System.out.println() is used after the inner loop to move to the next line for the next row of the rectangle.
        // Scanner Close: The scanner.close() method closes the scanner resource to avoid memory leaks.
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.println("Enter the number of columns: ");
        int columns = scanner.nextInt();
        
        System.out.println("Enter any symbol of your choice: ");
        String symbol = scanner.next(); // the next() stores the input until the "Enter" or "Space" key is pressed

        for(int i = 1; i <= rows; i++){
            System.out.println();
            for(int j = 1; j <= columns; j++){
                System.out.print(symbol);
            }
        }



        // Second program
        // Prompt user for symbol and dimensions
        System.out.print("Enter a symbol to fill the rectangle: ");
        char symb = scanner.next().charAt(0); // Get first character of input

        System.out.print("Enter the height of the rectangle: ");
        int height = scanner.nextInt();

        System.out.print("Enter the width of the rectangle: ");
        int width = scanner.nextInt();

        // Draw the rectangle using nested for loops
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(symb);
            }
            System.out.println(); // Move to the next line after each row
        }
        scanner.close();


    }
}
