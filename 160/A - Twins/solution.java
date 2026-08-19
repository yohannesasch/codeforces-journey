import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int coins = in.nextInt();
        in.nextLine();
        Integer[] amounts = new Integer[coins];
        int total = 0;
 
        for (int i=0; i<coins; i++) {
            amounts[i] = in.nextInt();
            total += amounts[i];
        }
        Arrays.sort(amounts, Collections.reverseOrder());
        int index = 0;
        int indexAmount = 0;
        for (int i = 0; i<coins; i++) {
            if (indexAmount > total/2) {
                break;
            } else {
                index++;
                indexAmount += amounts[i];
            }
        }
        System.out.println(index);
    }
}