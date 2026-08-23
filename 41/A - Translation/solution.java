import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
 
        String word1 = in.nextLine();
        String word2 = in.nextLine();
 
        StringBuilder sb = new StringBuilder(word2);
        String arr = sb.reverse().toString();
 
        if (word1.equals(arr)) {
            System.out.println("YES");
 
        } else {
            System.out.println("NO");
        }
 
 
    }
}