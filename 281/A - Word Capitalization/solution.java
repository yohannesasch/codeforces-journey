import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        char firstLetter =
                Character.toUpperCase(word.charAt(0));
        
 
        System.out.println(firstLetter + word.substring(1));
 
    }
}