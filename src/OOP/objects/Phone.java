package OOP.objects;

public class Phone {
    // Attributes

    String make = "Google Pixel";
    String model = "6a";
    String color = "white";
    String OS = "Android";
    String RAM = "8Gb";
    double price = 199.00;
    boolean phoneIsOn = true;


    // Methods

    void call(){
        
        if(phoneIsOn){
            System.out.println("The phone is on and you can make some calls");
        }else{
            System.out.println("Please turn on your phone to make call");
        }

    }
    void surf(){
        System.out.println("You can brows the internet");
    }
    
}
