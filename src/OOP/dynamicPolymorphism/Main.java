package OOP.dynamicPolymorphism;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Dynamic Polymorphism
        // dynamic = after compilation (during runtime)
        // you can create an object and make space for it in memory even if you don't know what type of object you want quite yet

        Scanner scanner = new Scanner(System.in);
        Phones phones;

        System.out.println("Which Phone do you want?");
        System.out.println("(1 = Google Pixel) or (2 = Samsung)");
        int choice = scanner.nextInt();

        if(choice==1){
            phones = new Pixel();
            phones.os();
        }else if(choice==2){
            phones = new Samsung();
            phones.os();
        }else{

            phones = new Phones();
            System.out.println("The phone you chose isn't available on the list but, 4");
            phones.os();
        }

        scanner.close();
    }
}
