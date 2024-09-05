import java.util.Scanner;

public class CoinValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int quarters = 0;
        int dimes = 0;
        int nickles = 0;
        int pennies = 0;

        System.out.println("Enter Num of quarters: ");
        quarters = sc.nextInt();
        System.out.println("Enter Num of dimes: ");
        dimes = sc.nextInt();
        System.out.println("Enter Num of nickles: ");
        nickles = sc.nextInt();
        System.out.println("Enter Num of pennies: ");
        pennies = sc.nextInt();

        double total = (quarters * 0.25) + (dimes * 0.1) + (nickles * 0.05) + (pennies * 0.01);

        System.out.println("The total value is " + total);

    }
}
