import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
 
public class Main {
 
    public static void solution(Scanner in) {
 
        int n = in.nextInt();
 
        int[] numbers = new int[n];
        Map<Integer, Integer> freq = new HashMap<>();
 
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
 
            freq.put(
                numbers[i],
                freq.getOrDefault(numbers[i], 0) + 1
            );
        }
 
        for (int k = 0; k < n; k++) {
 
            if (freq.get(numbers[k]) == 1) {
                System.out.println(k + 1);
                break;
            }
        }
    }
 
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
 
        int t = in.nextInt();
 
        for (int i = 0; i < t; i++) {
            solution(in);
        }
 
        in.close();
    }
}