import java.util.Scanner;

public class firstIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        scn.close();

        int fi = firstIndexCheck(arr , 0 , x);
        System.out.print(fi);
    }

    public static int firstIndexCheck(int[] arr , int idx, int x){
        if(idx == arr.length -1){
            return -1;
        }

        if(arr[idx] == x){
            return idx;
        }

        int fiisa = firstIndexCheck(arr, idx + 1, x);

        return fiisa;
    }
}
