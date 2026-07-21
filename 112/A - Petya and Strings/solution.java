import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstString = in.nextLine().toLowerCase();
        String secondString = in.nextLine().toLowerCase();
 
        int  lexoResult = firstString.compareTo(secondString);
 
        if (lexoResult > 0)
            System.out.println(1);
        else if (lexoResult < 0)
            System.out.println(-1);
        else
            System.out.println(0);
 
 
 
    }
}