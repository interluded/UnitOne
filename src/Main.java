import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Favourite Colour: ");
        String colour = sc.nextLine();
        System.out.println(name + " Likes " + colour + "\n" + name + "'s favourite colour is " + colour);


    }
}