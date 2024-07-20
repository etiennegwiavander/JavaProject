package OOP.objectPassing;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        Phone phone1 = new Phone("Pixel Phones");
        Phone phone2 = new Phone("Samsung Phones");
        Phone phone3 = new Phone("Apple Phones");

        System.out.println("New arrievals \n");
        store.stock(phone1);
        store.stock(phone2);
        store.stock(phone3);
    }
}
