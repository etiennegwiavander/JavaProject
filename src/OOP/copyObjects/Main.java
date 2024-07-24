package OOP.copyObjects;

public class Main {
    public static void main(String[] args) {
        
        Phone phone1 = new Phone("Samsung ", "Galaxy s24 ultra ", 2024);
        Phone phone2 = new Phone("Iphone ", "15 pro max ", 2024);
        
        phone2.copy(phone1);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println();
        System.out.println(phone1.getName());
        System.out.println(phone1.getModel());
        System.out.println(phone1.getYear());
        System.out.println();
        System.out.println(phone2.getName());
        System.out.println(phone2.getModel());
        System.out.println(phone2.getYear());

    }
}
