package OOP.objects;


public class Objects {
   public static void main(String[] args) {
    
    Phone myPhone = new Phone();
    
    System.out.println(myPhone.make);
    System.out.println(myPhone.model);
    System.out.println(myPhone.color);
    System.out.println(myPhone.OS);
    System.out.println(myPhone.RAM);
    System.out.println(myPhone.price);
    
    myPhone.call();
    myPhone.surf();
   } 
}
