import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 
        Scanner in =  new Scanner(System.in);
        int children = in.nextInt();
        int time = in.nextInt();
        in.nextLine();
        String arrangement = in.nextLine();
 
        char[] queue = arrangement.toCharArray();
 
        for (int j=0; j<time; j++) {
            for (int i = 0; i < children-1; i++) {
                if (queue[i] == 'B' && queue[i + 1] == 'G') {
                    char tempo = queue[i];
                    queue[i] = queue[i + 1];
                    queue[i + 1] = tempo;
                    i++;
                }
            }
        }
        for (char ch : queue) {
            System.out.print(ch);
        }
    }
}