import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int game = in.nextInt();
        in.nextLine();
        String result = in.nextLine().toUpperCase();
 
        int anton = 0;
        int danik = 0;
 
        for (int i = 0; i < game; i++) {
            if (result.charAt(i) == 'A') {
                anton++;
            } else {
                danik++;
            }
        }
        if (anton > danik) {
            System.out.println("Anton");
        } else if (anton < danik) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}