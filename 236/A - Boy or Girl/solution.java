import java.util.Scanner;
import java.util.HashSet;
 
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine().toLowerCase();
 
        HashSet<Character> chars = new HashSet<>();
 
        for (int i = 0; i < name.length(); i++) {
            chars.add(name.charAt(i));
        }
        if (chars.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}