import java.util.Scanner;

public class RandomRange {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lower bound: ");
        double lower = scan.nextDouble();
        System.out.println("Higher Bound: ");
        double higher = scan.nextDouble();
        if(higher > lower){
            int random_1 = (int) (lower + Math.random() * (higher - lower + 1));
            System.out.println("Random number is " + random_1);
        }
        else if (lower > higher){
            System.out.println("Lower bound is higher then higher bound, retry.");
            System.out.println("Lower bound: ");
            double lower_redone = scan.nextDouble();
            System.out.println("Higher Bound: ");
            double higher_redone = scan.nextDouble();
            int random_2 = (int) (lower_redone + Math.random() * (higher_redone - lower_redone +1 ));
            System.out.println("Random Number is: " + random_2);
        }


    }
}