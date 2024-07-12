import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        // Loops = Loops can execute a block of code as long as a specified condition is reached.
        // Loops are handy because they save time, reduce errors, and they make code more readable.

        // The while loop loops through a block of code as long as a specified condition is true

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
            
        }
        
        System.out.println("Hello " + name);
        
        scanner.close();

    }

    
}
