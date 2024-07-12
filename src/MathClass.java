import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        double opp; 
        double adj;
        double hyp;

        System.out.println("lets calculate the hypothenus of any triangle by following the steps below");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Opposite: ");
        opp = scanner.nextDouble();

        System.out.println("Enter the adjecent: ");
        adj = scanner.nextDouble();

        hyp = Math.sqrt((adj*adj) + (opp*opp));
        System.out.println("The Hypothenus is: "+ hyp);

        scanner.close();
    }
}
