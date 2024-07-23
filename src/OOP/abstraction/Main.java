package OOP.abstraction;

public class Main {
    public static void main(String[] args) {
        // abstract class cannot be instantiated, but they can have a subclass
        // abstract methods are declared without an implementation

        // Phone phone = new Phone(); // cannot instantiate the Phone class because of the abstraction keyword

        Pixel pixel = new Pixel();

        pixel.call("Pixel 6", 2021);
        pixel.call("Pixel 7", 2022);
        pixel.call("Pixel 8", 2023);


    }

}
