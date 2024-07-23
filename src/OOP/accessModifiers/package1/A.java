package OOP.accessModifiers.package1;
import OOP.accessModifiers.package2.*;

public class A {
    public static void main(String[] args) {
        C c = new C();

        System.out.println(c.publicMessage);

        // System.out.println(c.protectedMessage); 
        // System.out.println(c.defaultMessage);
        

    } 
}
