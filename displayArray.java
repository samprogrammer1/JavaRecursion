import java.util.Scanner;

public class displayArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scn.nextInt();
        }
        scn.close();
        displayArr(array , 0);
    }

    public static void displayArr(int[] array , int idx){
        if(idx == array.length ){
            return;
        }
        
        displayArr(array, idx + 1);
        System.out.println(array[idx]);
        // displayArr(array, idx - 1);
    }
}
