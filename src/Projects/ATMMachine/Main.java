package Projects.ATMMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double AccountBalance = 5000;
        Scanner scanner = new Scanner(System.in);

        String bankName = "UBA";
        // Welcome page
        System.out.println("Welcome to "+ bankName + " ATM service (:");
        System.out.println("  Where we make life easy!");
        System.out.println("Choose you language of dialogue");
        System.out.println("Enter **1** for English");
        System.out.println("Entrez **2** pour le Français");
        int choice = scanner.nextInt();
        
        if (choice == 1){
            System.out.println("You've chosen English as your main language");
        }else if(choice == 2){
            System.out.println("Vous avez choisi le français comme langue principale");
        }else{
            System.out.println("To proceed, enter either number 1 or 2");
        }
    }
}
