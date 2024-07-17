package OOP.diceRoller;
import java.util.Random;
public class DiceRoller {

    Random random;
    int result;

    DiceRoller(){
        random = new Random();
        roll();
    }
    void roll(){
        result = random.nextInt(6)+1;
        System.out.println(result);
    }
}
