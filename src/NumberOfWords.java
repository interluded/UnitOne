import java.util.Scanner;

public class NumberOfWords
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = scan.nextLine();

        System.out.println("There are " + numWords(str) + " words.");
    }

    // Write a function method called numWords that accepts a String parameter
    // and returns the number of words in that String.
    // For example, numWords("today is a great day!") will return 5.
    // (Hint: count the number of spaces)
    public static int numWords(String a){
        int length = a.length();
        int words = 1;
        for(int i = 0; i<length; i++){
            if(a.charAt(i) == ' '){
                words++;
            }
        }
        return words;
// new whip new car new coupe
    }



}
