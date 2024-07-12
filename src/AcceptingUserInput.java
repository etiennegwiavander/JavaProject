import java.util.Scanner; // This import is very important for the scanner to work
// Scanners can be used to accept users input and can also be used to read the contents of a file etc.
public class AcceptingUserInput {
    public static void main(String[] args) {
        System.out.println("What is your name? ");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello name is " +name);

        System.out.println("How old are you?");
        int age = scanner.nextInt();
        System.out.println("I am " + age + " years old");
        scanner.nextLine(); // this was added to create empty the input field and create a new line since nextInt() method cant.

        System.out.println("What's your favorite food?");
        String food = scanner.nextLine();
        System.out.println("My favorite food is " + food);
        scanner.close();
    }
    
}
