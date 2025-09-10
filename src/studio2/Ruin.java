import java.util.Scanner;
public class Ruin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("What amount of money did you start with?");
        double startAmount = in.nextDouble();

        System.out.println("What is the probability that you win a single play?");
        double winChance = in.nextDouble();

        System.out.println("What amount should you win to quit playing?");
        double winAmount = in.nextDouble();

        System.out.println("How many days have you played?");
        int totalSimulations = in.nextInt();

        double count = startAmount;
        while (count>=0 && count<winAmount) 
        {
            if (Math.random()<winChance) {
                System.out.println(count--);
            }
            else {
                System.out.println(count++);
            }
        }
    }
}

