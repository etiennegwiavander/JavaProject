package OOP.interface1;

public class Main {
    public static void main(String[] args) {
        // interface - a template that can be applied to a class.
        //             similar to inheritance, but specifies what a class has/must do.
        //             classes can apply more than one interface, inheritance is limited to 1 super class


        Zebra zebra = new Zebra();
        zebra.flee();

        Lion lion = new Lion();
        lion.hunt();

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
    }    
}
