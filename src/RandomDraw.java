import java.util.Scanner;
public class RandomDraw {



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter upper bound: ");
        int a = sc.nextInt();

        System.out.println("Enter lower bound: ");
        int b = sc.nextInt();
        double random = Math.random() * a + b;
        System.out.println(random);
    }

}
