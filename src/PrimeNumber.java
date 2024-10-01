import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int a = scan.nextInt();

        if (isPrime(a) == true)
            System.out.println(a + " is prime");
        else
            System.out.println(a + " is not prime");
    }

    // Write a function method called isPrime that accepts an int parameter and
    // returns true if that number is prime and false otherwise. A prime number
    // is a number with only 2 factors (1 and itself).
    // For example,
    //         isPrime(13) will return true
    //         isPrime(12) will return false
    //         isPrime(2) will return true

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


}
