package OOP.staticKeyword;

public class Main {
    public static void main(String[] args) {

        // static = modifier. A single copy of a variable/method is created and shared
        //          The class "owns" the static member

         // Assuming Phone class has a name property and potentially a DisplayPhones method
         Phone phone1 = new Phone("Google Pixel");
         Phone phone2 = new Phone("Samsung");
         Phone phone3 = new Phone("Iphone");
 
         Phone[] phones = {phone1, phone2, phone3};
 
         // Loop through phones array (<= phones.length - 1 to avoid out-of-bounds)
         for (int i = 1; i <= phones.length; i++) {
             System.out.print(i + ". ");
             System.out.println(phones[i - 1].name);
         }
 
         // Assuming Phone class has a static variable numberOfPhones incremented during creation
         System.out.println("Total Phones: " + Phone.numberOfPhones);
 
         System.out.println("Using a static method (if Phone class has DisplayPhones method)");
         Phone.DisplayPhones(); // Call static method if it exists
 

        

    }
}
