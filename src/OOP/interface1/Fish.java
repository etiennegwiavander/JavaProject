package OOP.interface1;

public class Fish implements Predator, Prey {

    @Override
    public void flee() {
        System.out.println(" This Fish is fleeing from larger fish!");
    }

    @Override
    public void hunt() {
       System.out.println(" This Fish is hunting smaller fish!");
        
    }
    
}
