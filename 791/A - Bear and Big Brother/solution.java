import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int limak = in.nextInt();
        int bob = in.nextInt();
        int year = 0;
 
        while (limak <= bob) {
            limak *= 3;
            bob *= 2;
            year++;
 
        }
 
        System.out.println(year);
    }
}