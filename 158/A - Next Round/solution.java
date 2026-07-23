import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        in.nextLine();
        int[] contest = new int[n];
        int counter = 0;
        for(int i=0; i<n; i++) {
            contest[i] = in.nextInt();
        }
        int target = contest[k-1];
        for (int j=0; j<n; j++) {
            if (contest[j] >= target && contest[j] > 0) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}