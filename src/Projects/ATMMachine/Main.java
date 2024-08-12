package Projects.ATMMachine;

import java.util.Scanner;

public class Main {
    public static double accountBalance = 5000; // Replace with database or other persistence mechanism
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String bankName = "UBA";
        // Welcome message
        System.out.println("Welcome to "+ bankName + " ATM service (:");
        System.out.println("  Where we make life easy!");
        System.out.println("Choose you language of dialogue");
        System.out.println("Enter **1** for English");
        System.out.println("Entrez **2** pour le Français");

        // int languageChoice = scanner.nextInt();

        // Language selection
        int choice = getLanguageChoice(scanner);
        
        // choose your language
        if (choice == 1){
            System.out.println("You've chosen English as your main language");
            displayMenu(choice);

            int selection = scanner.nextInt();

            switch (selection) {
                case 1:
                    checkBalance(); // Replace with actual balance retrieval logic
                    break;
                case 2:
                    // Implement functionality for withdrawal
                    withdrawCash(scanner);
                    break;
                case 3:
                    // Implement functionality for deposit
                    depositCash(scanner);                   
                    
                    break;
                case 4:
                    System.out.println("Thank you for using " + bankName + " ATM service. Have a nice day!");
                    return; // Exit the program
                default:
                    System.out.println("Invalid selection. Please enter a number between 1 and 4.");
            }
        }else if(choice == 2){
            System.out.println("Vous avez choisi le français comme langue principale");
            displayMenu(choice);
        }else{
            System.out.println("To proceed, enter either number 1 or 2");
        }
  
        // checkBalance();
        scanner.close();
    
    }
    public static int getLanguageChoice(Scanner scanner) {
        // System.out.println("Choose your language of dialogue:");
        // System.out.println("Enter 1 for English");
        // System.out.println("Entrez 2 pour le Français");
        
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

    public static void checkBalance(){
    double accountBalance = 5000;
        System.out.println("Your account Balance is: "+ accountBalance + " CFA");
    }

    public static void withdrawCash(Scanner scanner) {
        System.out.println("Enter amount to withdraw (must be less than or equal to your balance):");
        double withdrawalAmount = scanner.nextDouble();

        if (withdrawalAmount > accountBalance) {
            System.out.println("Process terminated!");
            System.out.println("Reason: Insufficient funds. Your current balance is: " + accountBalance + " CFA");
            System.out.println("Enter an ammount within your account balance");
        } else {
            accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal successful. Your remaining balance is: " + accountBalance + " CFA");
        }
    }

    public static void depositCash(Scanner scanner) {
        System.out.println("Enter amount to deposit:");
        double depositAmount = scanner.nextDouble();

        if (depositAmount < 0) {
            System.out.println("Invalid deposit amount. Please enter a positive value.");
        } else {
            accountBalance += depositAmount;
            System.out.println("Deposit successful. Your new balance is: " + accountBalance + " CFA");
        }
    }

}
