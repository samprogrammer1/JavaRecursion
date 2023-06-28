import java.util.Scanner;

public class powerLinear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        scn.close();
        int xn = power(x, n);
        System.out.println(xn);

    }


    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }

        int xpnb2 = power(x, n / 2);

        int xn = xpnb2 * xpnb2;

        if( n % 2 == 1){
            xn = xn * x;
        }

        return xn;

    }
}
