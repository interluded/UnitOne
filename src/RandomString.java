public class RandomString {

    public static void main(String[] args) {
        int length = 6;

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            System.out.print(characters.charAt(index));
        }
        System.out.println();
    }
}
