import java.util.Scanner;
public class RandomString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double random =  Math.random() * 65 + 90;
        for (int x = 0; x < 6; x++) {
            int randomAscii = (int) (Math.random() * 26) + 65;
            char randomChar = (char) randomAscii;
            System.out.print(randomChar);
        }

    }

}
