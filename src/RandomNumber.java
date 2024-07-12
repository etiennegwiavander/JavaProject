import java.util.Random;;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();

        double anyNumber = random.nextDouble();
        System.out.println(6 + anyNumber);

        int randomVal = random.nextInt(6);
        System.out.println(randomVal + 1);
    }
}
