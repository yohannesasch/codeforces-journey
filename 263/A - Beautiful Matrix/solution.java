import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int row =0;
        int column =0;
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                matrix[i][j] = in.nextInt();
                if (matrix[i][j]==1) {
 
                    row = i;
                    column = j;
                }
 
            }
        }
        int beautifulMatrix = Math.abs(row-2) + Math.abs(column-2);
        System.out.println(beautifulMatrix);
    }
}