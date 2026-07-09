import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        int n = in.nextInt();
        int a;
        int b;
        int c;
        int solved=0;
        for(int i=0;i<n;i++){
            a=in.nextInt();
            b=in.nextInt();
            c=in.nextInt();
            if(a+b+c >= 2){
                solved++;
            }
        }
        System.out.println(solved);
 
    }
}