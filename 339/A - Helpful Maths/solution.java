import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        String summands = in.nextLine().trim();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
 
        for (int i=0; i<summands.length(); i++) {
            if (summands.charAt(i)=='1') {
                count1++;
            } else if (summands.charAt(i)=='2'){
                count2++;
            } else if (summands.charAt(i)=='3') {
                count3++;
            }
        }
 
        boolean isFirst = true;
 
        for (int i =0; i<count1; i++) {
            if (!isFirst) {
                System.out.print("+");
            }
            System.out.print(1);
            isFirst = false;
        }
        for (int j=0; j<count2; j++) {
            if (!isFirst) {
                System.out.print("+");
            }
            System.out.print(2);
            isFirst = false;
        }
        for (int k=0; k<count3; k++) {
            if (!isFirst) {
                System.out.print("+");
            }
            System.out.print(3);
            isFirst = false;
        }
    }
}