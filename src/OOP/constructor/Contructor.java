package OOP.constructor;

public class Contructor {
    public static void main(String[] args) {
        // constructor = special method that is called when an object is instantiated (created)

        Phone phone1 = new Phone("Google Pixel 6a", 2022, "Android", 14);
        Phone phone2 = new Phone("Google Pixel 5", 2019, "Android", 12);

        System.out.println(phone1.model);
        phone1.review();
        
        System.out.println();

        System.out.println(phone2.model);
        phone2.review();
    }

}
