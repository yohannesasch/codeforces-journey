import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int f = in.nextInt();
 
        if (f % 5 == 0) {
            System.out.println(f/5);
        } else {
            int n = f % 5;
            System.out.println((f-n)/5 + 1);
        }
    }
}