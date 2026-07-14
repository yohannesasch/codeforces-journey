import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x =0;
        
        for (int i =0; i<n; i++){
            String s = in.next();
            if (s.charAt(1)=='+'  ){
                ++x;
            } else if ( s.charAt(1)=='-'  ){
                --x;
            }
        }
        System.out.println(x);
    }
}