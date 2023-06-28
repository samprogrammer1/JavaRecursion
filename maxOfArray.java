import java.util.Scanner;

public class maxOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] array = new int[n];

        for(int i = 0; i < n; i++){
            array[i] =  scn.nextInt();
        }
        scn.close();

        int max = maxArray(array , 0);
        System.out.println(max);
    }

    public static int maxArray(int[] arr , int idx){
        if(idx == arr.length - 1){
            return arr[idx];
        }

        int masi = maxArray(arr, idx + 1);
        if(masi > arr[idx]){
            return masi;
        }else {
            return arr[idx];
        }
    }
}
