package OOP.methodOverriding;

public class Main {
    public static void main(String[] args) {
        // Method overiding = Declaring a method in sub class, which is already present in parent class 
        //                    (done so that a child   class can give its own implementation)

        Phone phone = new Phone();
        phone.call();

        System.out.println();
        
        Pixel pixel = new Pixel();
        pixel.call();

    }
}
