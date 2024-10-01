import java.util.Scanner;
import java.util.stream.IntStream;

public class SumRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scan.nextInt();

        System.out.print("Enter the second number: ");
        int b = scan.nextInt();

        System.out.println("The sum is " + sumRange(a, b));
    }

    public static int sumRange(int a, int b){
        return IntStream.rangeClosed(a, b).sum();
    }

}