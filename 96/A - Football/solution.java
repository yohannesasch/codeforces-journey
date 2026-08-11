import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String position = in.nextLine();
        int counter = 1;
        boolean dang = false;
 
        for (int i=1; i<position.length(); i++) {
            if (position.charAt(i) == position.charAt(i-1)) {
                counter++;
            } else {
                counter = 1;
            }
 
            if (counter >= 7) {
                dang = true;
                break;
            }
        }
 
        if (dang) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}