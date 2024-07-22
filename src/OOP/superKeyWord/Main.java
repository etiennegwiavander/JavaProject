package OOP.superKeyWord;

public class Main {
    public static void main(String[] args) {
        // super = keyword referes to the superclass (parent) of an object very similar to the "this" keyword

        Pixel pixel1 = new Pixel("Pixel 6", 2022, "Google tensor chipset \n");
        System.out.println(pixel1.toString());


        Pixel pixel2 = new Pixel("Pixel 7", 2023, "Google tensor 2 chipset");
        System.out.println(pixel2);

    }
}
