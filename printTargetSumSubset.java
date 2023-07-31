import java.util.Scanner;

public class printTargetSumSubset {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] array = new int[n];
        for(int i = 0; i < array.length; i++){
            array[i] = scn.nextInt();
        }
        int target = scn.nextInt();

        printtargetsumSubsetValue(array , 0, "", 0 , target);
    }

    public static void printtargetsumSubsetValue(int[] array ,int idx, String set , int sos , int target){

        if(idx == array.length){
            if(sos == target){
                System.out.println(set + " .");
            }
            return;
        }

        printtargetsumSubsetValue(array, idx+ 1, set + array[idx] + ", ", sos + array[idx], target);
        printtargetsumSubsetValue(array, idx+1, set, sos, target);
    }
}
