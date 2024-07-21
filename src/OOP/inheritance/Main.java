package OOP.inheritance;

public class Main {
    public static void main(String[] args) {
        // inheritance = the process where one class acquires the attributes and methods of another class.

        Pixel7Pro pixel7Pro = new Pixel7Pro();

        System.out.println("Google Pixel 8 pro");
        System.out.println();
        pixel7Pro.tensoChip();
        pixel7Pro.designLanguage();
        System.out.println(pixel7Pro.cameraSystem);
        System.out.println();
        
        System.out.println("Google Pixel 8 pro");
        System.out.println();
        Pixel8Pro pixel8Pro = new Pixel8Pro();
        pixel8Pro.tensoChip();
        pixel8Pro.designLanguage();
        System.out.println(pixel8Pro.display);
        
    }
}
