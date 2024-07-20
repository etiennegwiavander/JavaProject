package OOP.staticKeyword;

public class Phone {
    String name;
    static int numberOfPhones;

    Phone(String name){
        this.name = name;
        numberOfPhones++;
    }

    static void DisplayPhones(){
        System.out.println("You have " + numberOfPhones+ " phones");
    }
}
