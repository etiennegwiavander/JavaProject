package OOP.dynamicPolymorphism;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Dynamic Polymorphism
        // dynamic = after compilation (during runtime)

        Scanner scanner = new Scanner(System.in);
        Phones phones;

        System.out.println("Which Phone do you want?");
        System.out.println("(1 = Google Pixel) or (2 = Samsung)");
        int choice = scanner.nextInt();

        if(choice==1){
            phones = new Phones();
            phones.os();
        }else if(choice==2){
            phones = new Phones();
            phones.os();
        }else{
            
            phones.os();
        }

        scanner.close();
    }
}
