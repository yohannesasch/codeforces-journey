import java.util.Scanner;
 
public class Main {
 
    public static void solution(Scanner in) {
 
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
 
        if (num1 + num2 == num3 || num1 + num3 == num2 || num2 + num3 == num1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
 
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
 
        int n = in.nextInt();
 
        for (int i = 0; i < n; i++) {
            solution(in);
        }
    }
}