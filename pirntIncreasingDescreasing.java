import java.util.Scanner;

public class pirntIncreasingDescreasing {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =  scn.nextInt();
        scn.close();
        IncreasingDescreasing(n);
    }

    public static void IncreasingDescreasing(int n){
        if(n == 0){
            return;
        }

        System.out.println(n);
        IncreasingDescreasing(n - 1);
        System.out.println(n);
    }
}
