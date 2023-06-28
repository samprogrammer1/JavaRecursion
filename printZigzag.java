import java.util.Scanner;

public class printZigzag {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        pzz(n);
    }

    public static void pzz(int n ){
        if( n == 0) { //1
            return;
        }
        System.out.println("pre " + n); //2
        pzz(n - 1); //3
        System.out.println("load "+ n); //4
        pzz(n - 1); //5
        System.out.println("last "+ n); //6

    }
}
 