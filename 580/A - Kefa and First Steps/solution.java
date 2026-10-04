import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
 
        int days = in.nextInt();
        int[] moneys = new int[days];
 
        for (int i = 0; i < moneys.length; i++) {
            moneys[i] = in.nextInt();
        }
 
        int maxCount = 1;
        int count = 1;
        for (int i = 1; i < moneys.length ; i++) {
 
            
            if (moneys[i] >= moneys[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            
            if (count > maxCount) {
                maxCount = count;
            }
 
        }
 
        System.out.println(maxCount);
    }
}