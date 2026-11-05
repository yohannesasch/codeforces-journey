import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
 
        int friendsN = in.nextInt();
        int bottlesK = in.nextInt();
        int millilitersL = in.nextInt();
        int limesC = in.nextInt();
        int limeSliceD = in.nextInt();
        int saltGramP = in.nextInt();
        int millDrinkNL = in.nextInt();
        int saltNP = in.nextInt();
 
        int drinkForEach = (bottlesK * millilitersL) / (friendsN * millDrinkNL);
        int limeSliceForEach = (limesC * limeSliceD) / friendsN;
        int saltForEach = saltGramP / (friendsN * saltNP);
        
        System.out.println(Math.min(saltForEach, Math.min(drinkForEach, limeSliceForEach)));
 
 
    }
}