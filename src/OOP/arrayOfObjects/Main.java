package OOP.arrayOfObjects;

public class Main {
    public static void main(String[] args) {
        
        // Phone[] store = new Phone[3]; // Method one

        Phone phone1 = new Phone("Google Pixel 6pro");
        Phone phone2 = new Phone("Samsung Galaxy s21 ultra");
        Phone phone3 = new Phone("Iphone 12pro max");

        Phone[] store = {phone1, phone2, phone3};

        // store[0] = phone1; // method one
        // store[1] = phone2; //method one
        // store[2] = phone3; // method one

        System.out.println("Manually printing out the array items \n");
        
        System.out.println(store[0].name);
        System.out.println(store[2].name);
        System.out.println(store[2].name + "\n");

        System.out.println("Using the for loop:");
        System.out.println();
        for (int i = 0; i < store.length; i++) {

            System.out.println(store[i].name);
            
        }

    }
}
