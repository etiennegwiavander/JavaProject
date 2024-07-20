package OOP.staticKeyword;

public class Main {
    public static void main(String[] args) {

        // static = modifier. A single copy of a variable/method is created and shared
        //          The class "owns" the static member

        Phone phone1 = new Phone("Google Pixel");
        Phone phone2 = new Phone("Samsung");
        Phone phone3 = new Phone("Iphone");

        System.out.println(Phone.numberOfPhones);

        System.out.println("Using a static method");
        
        Phone.DisplayPhones();

        

    }
}
