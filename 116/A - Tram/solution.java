import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        int stop = in.nextInt();
 
        int currentPassenger = 0;
        int maxPassenger = 0;
 
        for(int i=0; i<stop; i++) {
           int exit = in.nextInt();
            int enter = in.nextInt();
 
            currentPassenger += enter - exit;
 
            if (maxPassenger < currentPassenger) {
                maxPassenger = currentPassenger;
            }
        }
 
        System.out.println(maxPassenger);
    }
}