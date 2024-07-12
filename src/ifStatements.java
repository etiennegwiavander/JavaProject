import java.util.Scanner;
public class ifStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        
        if (age < 18) {
            System.out.println(name + " You are a Minor. So, you're not allowed to drink alcohol!");
        }else{
            System.out.println("Congratulations " + name + " You are free to drink what ever you can afford!");
        }

        scanner.close();
    }
}
