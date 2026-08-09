import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int line = in.nextInt();
        in.nextLine();
 
        int sumX = 0;
        int sumY = 0;
        int sumZ = 0;
 
        for (int i=0; i<line; i++) {
            sumX += in.nextInt();
            sumY += in.nextInt();
            sumZ += in.nextInt();
        }
 
        if (sumX == 0 && sumY == 0 && sumZ == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}