import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
 
        String word = in.nextLine();
        int upper = 0;
        int lower = 0;
 
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                upper++;
            } else if (Character.isLowerCase(word.charAt(i))) {
                lower++;
            }
        }
 
        if (upper > lower) {
            System.out.println(word.toUpperCase());
            return;
        }
        System.out.println(word.toLowerCase());
    }
}