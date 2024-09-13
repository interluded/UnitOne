import java.util.Scanner;
public class MiddleString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.nextLine();

        int index = s.indexOf(" ");
        int index2 = s.indexOf(" ",index + 1);
        System.out.println(s.substring(index + 1, index2));



    }
}
