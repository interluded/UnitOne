import java.util.Scanner;
public class Initals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your name");
        String name = scan.nextLine();
        System.out.print(name.charAt(0) + ".");
        int x = name.indexOf(" ");
        System.out.print(name.charAt(x + 1) + ".");
        int y = name.indexOf(" ", x + 1);
        System.out.print(name.charAt(y + 1) + ".");
    }
}