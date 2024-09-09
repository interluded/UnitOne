import java.util.Scanner;
public class NumCoins {

   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter total value: ");
       double totalvalueDollars = sc.nextDouble();
     int totalvalue = (int) (totalvalueDollars * 100);

       int quarters = totalvalue / 25;
       int dimes = (totalvalue % 25) / 10;
       int nickles = (totalvalue % 25 % 10) / 5;
       int pennies = totalvalue % 5;

       System.out.println("# Quarters: " + quarters);
       System.out.println("# Dimes: " + dimes);
       System.out.println("# Nickles: " + nickles);
       System.out.println("# Pennies: " + pennies);
   }


}
