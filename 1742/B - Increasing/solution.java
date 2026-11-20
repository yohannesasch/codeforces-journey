import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
public class Main {
 
    public static void solution(Scanner in) {
 
        int t = in.nextInt();
 
        Set<Integer> set = new HashSet<>();
 
        for (int i = 0; i < t; i++) {
 
            int input = in.nextInt();
 
            set.add(input);
 
        }
 
        if (t == set.size()) {
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