import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
 
        List<Integer> luckyList = new ArrayList<>(
                List.of(4,7,44,47,77,444,447,474,477,744,747,774,777)
                );
        boolean isLucky = false;
        for (int num : luckyList) {
            if (number % num == 0) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}