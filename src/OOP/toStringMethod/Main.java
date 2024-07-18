package OOP.toStringMethod;

public class Main {
    public static void main(String[] args) {
        // toString() = special method that all objects inherit
        //              that returns a string that "textually represents" an object.
        //              can be use both implicitly and explicitly
        Phone phone = new Phone();

        System.out.println("Explicite calling");
        System.out.println(phone.toString()); //explicit calling

        System.out.println();

        System.out.println("Implicit calling");
        System.out.println(phone); // implicit calling
    }
}
