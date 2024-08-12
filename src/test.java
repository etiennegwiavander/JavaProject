import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bankName = "UBA";

        // Welcome message
        System.out.println("Welcome to " + bankName + " ATM service (:");
        System.out.println(" Where we make life easy!");

        // Language selection
        int choice = getLanguageChoice(scanner);

        // Main loop for ATM functionalities
        while (true) {
            displayMenu(choice);
            int selection = scanner.nextInt();

            switch (selection) {
                case 1:
                    checkBalance(5000.0); // Replace with actual balance retrieval logic
                    break;
                case 2:
                    // Implement functionality for withdrawal
                    System.out.println("Withdrawal functionality is not yet implemented.");
                    break;
                case 3:
                    // Implement functionality for deposit
                    System.out.println("Deposit functionality is not yet implemented.");
                    break;
                case 4:
                    System.out.println("Thank you for using " + bankName + " ATM service. Have a nice day!");
                    return; // Exit the program
                default:
                    System.out.println("Invalid selection. Please enter a number between 1 and 4.");
            }
        }
    }

    public static int getLanguageChoice(Scanner scanner) {
        System.out.println("Choose your language of dialogue:");
        System.out.println("Enter 1 for English");
        System.out.println("Entrez 2 pour le Français");
        
        int choice = scanner.nextInt();

        while (choice != 1 && choice != 2) {
            System.out.println("Invalid selection. Please enter either 1 or 2.");
            choice = scanner.nextInt();
        }

        return choice;
    }

    public static void displayMenu(int languageChoice) {
        if (languageChoice == 1) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Cash (Not implemented yet)");
            System.out.println("3. Deposit Cash (Not implemented yet)");
            System.out.println("4. Exit");
        } else { // languageChoice == 2 (French)
            System.out.println("\nMenu ATM :");
            System.out.println("1. Vérifier le solde"); // Check Balance
            System.out.println("2. Retirer de l'argent (pas encore implémenté)"); // Withdraw Cash
            System.out.println("3. Déposer de l'argent (pas encore implémenté)"); // Deposit Cash
            System.out.println("4. Sortir"); // Exit
        }
    }

    public static void checkBalance(double accountBalance) {
        System.out.println("Your account balance is: " + accountBalance + " CFA");
    }
}

