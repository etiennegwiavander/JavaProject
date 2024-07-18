package OOP.overloadedConstructors;

public class Main {
    public static void main(String[] args) {
        // overloaded constructors = multiple constructors within a class with the same name, but have different parameters.
        //                            name + parameters = constructor signature 
        // To use an overloaded constructor, jus chane the number of parameters in the class and display them normally.
        
        Phone phone = new Phone("Google Pixel", "6a", "Android", 6);

        System.out.println("Do you need " + phone.company + " with the following specs: " );
        System.out.println(phone.company + " " + phone.model);
        System.out.println(phone.OS);
        System.out.println(phone.ram + "Gb ?");

    }
}
