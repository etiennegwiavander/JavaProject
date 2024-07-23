package OOP.abstraction;

public class Pixel extends Phone {

    @Override
    void call(String name, int year) {
        System.out.println("I am making a call with my "+name+ " that was produduced in the year " + year);
    } // without this method, we'll have an error "The type Pixel must implement the inherited abstract method Phone.call()"
    
}
