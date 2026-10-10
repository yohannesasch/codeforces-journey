import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
 
        String number = in.next();
 
        int lucky = 0;
 
        for (int i = 0; i < number.length(); i++) {
            char dig = number.charAt(i);
 
            if (dig == '4' || dig == '7') {
                lucky++;
            }
        }
 
        if (lucky == 4 || lucky == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
 
        in.close();
    }
}