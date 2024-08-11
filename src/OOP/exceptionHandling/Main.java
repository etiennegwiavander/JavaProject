package OOP.exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // exception = an event that occurs during the execution of a program that disrupts the normal flow of instructions
        Scanner scanner = new Scanner(System.in);
        try{
            
            System.out.println("Welcome to my simple division calculator");

            System.out.println("Enter a whole number for x: ");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number for y:");
            int y = scanner.nextInt();

            // System.out.println("Enter a mathematical operation (+, -, *, /): ");
            // char u = scanner.next().charAt(0);
            // System.out.println("The symbol is "+ u);

            int z = x / y;

            System.out.println("The result of "+ x +" divided by "+ y + " is: "+ z);
        }
        catch(ArithmeticException e){
            System.out.println("Try inputting a number greater than zero!");
        }
        catch(InputMismatchException e){
            System.out.println("You can not divide a number by a string variable!");
        }finally{
            scanner.close();
        }

    }
}
