import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        while (in.hasNextInt()) {
            int n = in.nextInt();
            in.nextLine();
 
            for (int i = 0; i < n; i++) {
                String word = in.next();
                int wordLength = word.length();
                if (wordLength <= 10) {
                    System.out.println(word);
                } else {
                    System.out.println("" + word.charAt(0) + (wordLength - 2) + word.charAt(wordLength - 1));
                }
            }
        }
        in.close();
    }
}