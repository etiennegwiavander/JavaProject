import java.util.Scanner;
public class LogicalOperators {
    public static void main(String[] args) {
        // Logical operators = used to connect two or more expressions
        //          && = (AND) both conditions must be true
        //          || = (OR) either condition must be true
        //          ! = (NOT) reverses boolean value of condition.

        Scanner scanner = new Scanner(System.in);

        System.out.println("You're playing a game! Press q or Q to quit.");
        String res = scanner.next(); // the next() method is used to store the input we write until we hit enter of space key

        if(!res.equals("q") && !res.equals("Q")){
            System.out.println("You're still playing the game!");
        }else{
            System.out.println("You quit the game!");
        }

        scanner.close();
    }
}
