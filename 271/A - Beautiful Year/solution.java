import java.util.HashSet;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
 
        int y = in.nextInt();
        y++;
 
        while(true) {
            String year = String.valueOf(y);
 
            HashSet<Character> digits = new HashSet<>();
            for (int i = 0; i < year.length(); i++) {
                digits.add(year.charAt(i));
            }
            
                if (digits.size() == 4) {
                    System.out.println(year);
                    break;
                }
 
            y++;
        }
    }
}