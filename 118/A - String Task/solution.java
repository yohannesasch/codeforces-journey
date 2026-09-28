import java.util.Scanner;
 
public class Main {
 
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'o' || c == 'y' || c =='e' || c == 'u' || c == 'i';
    }
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
        String input = in.nextLine().toLowerCase();
 
        StringBuilder output = new StringBuilder();
 
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (!isVowel(current)) {
                output.append(".");
                output.append(current);
            }
        }
 
        System.out.println(output.toString());
 
 
    }
}