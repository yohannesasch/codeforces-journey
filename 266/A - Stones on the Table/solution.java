import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int noStone = in.nextInt();
        in.nextLine();
        String color = in.nextLine();
        int noRemoved = 0;
 
        for (int i = 1; i < noStone; i++) {
            if (color.charAt(i) == color.charAt(i - 1)) {
                noRemoved++;
            }
        }
        System.out.println(noRemoved);
    }
}