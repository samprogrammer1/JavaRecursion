import java.util.*;

public class allindices {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        scn.close();
        int[] iarr = allIndicesCheck(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndicesCheck(int[] arr, int x, int idx, int fsf) {
         
        // write ur code here
        if(idx == arr.length ){
            return new int[fsf];
        }

        if(arr[idx] == x){
            int[] iarr = allIndicesCheck(arr, x, idx + 1, fsf + 1);
            iarr[fsf] = idx;
            return iarr; 
        }else{
            int[] iarr = allIndicesCheck(arr, x, idx + 1, fsf + 1);
            return iarr;
        }

        
    }
}
