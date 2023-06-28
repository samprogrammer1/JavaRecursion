import java.util.Scanner;

public class factorial {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int fact =  factorialRun(n);
        scn.close();
        System.out.println(fact);
    }

    public static int factorialRun(int n){
        if(n == 1) {
            return 1;
        }
        
        int fact1 = factorialRun(n -1);
        int fn = n * fact1;
        return fn;
    }
}
                        