import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        int numOfQueries = in.nextInt();
 
       for (int i = 0; i < numOfQueries; i++) {
 
           int l1 = in.nextInt();
           int r1 = in.nextInt();
           int l2 = in.nextInt();
           int r2 = in.nextInt();
 
           if (l1 == r1 && l2 == r2 && l1 == l2) {
               System.out.println(-1 + " " + -1);
           } else {
 
               int ai = r1;
               int bi = l2;
               
               if (ai == bi) {
                   ai = l1;
               }
 
               System.out.println(ai + " " + bi);
 
           }
           
 
       }
    }
}