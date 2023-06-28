import java.util.Scanner;

public class lastIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        scn.close();
        int li = lastIndexCheck(arr, 0 , x);

        System.out.println(li);
    }

    public static int lastIndexCheck(int[] arr , int idx , int x){
        if(idx == arr.length -1){
            return -1;
        }

        int li = lastIndexCheck(arr, idx + 1, x);
        if(li == -1){
            if(arr[idx] == x){
                return idx;
            }else{
                return -1;
            }
        }else{
            return li;
        }

    }
    
}
