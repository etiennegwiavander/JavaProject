package OOP.encapsulation;

public class Main {
    public static void main(String[] args) {
        // Encapsulation = attributes of a class will be hidden or private,
        //                 Can be accessed only through methods (getters and setters) 
        //                 You should make attributes private if you don't have a reason to make them public      
        Phone phone = new Phone("Google Pixel", " 8pro", 2024);

        System.out.println(phone);
        //Displaying using the getters

        System.out.print(phone.getName());
        System.out.println(phone.getModel());
        System.out.println(phone.getYear());

        // Using the setters

        phone.setName("Samsung");
        phone.setModel(" Galaxy S24 ultra");
        
        System.out.print(phone.getName());
        System.out.println(phone.getModel());
        System.out.println(phone.getYear());


    }
}
