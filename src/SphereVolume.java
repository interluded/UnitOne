import java.util.Scanner;

public class SphereVolume {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the double for the volume ");
        double r = sc.nextDouble();

        double x = (1.3333333333333333333333333333333) * Math.PI * Math.pow(r,3);

        System.out.println("Answer: " + x);

    }
}
