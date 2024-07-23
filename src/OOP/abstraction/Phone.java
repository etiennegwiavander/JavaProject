package OOP.abstraction;

public abstract class  Phone {
    // abstract void  call(){
    //     System.out.println("Phones can be used to make calls");

    // } // the method above returns an error because, abstract methods do not specify a body

    abstract void call(String name, int year);// this works because I didn't specify a body

    // If a non-abstract method exists in the parent class, you can call it from a subclass method using super.methodName().

}
