import java.util.ArrayList;
import java.util.Scanner;

public class get_stair_paths {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> arr = stairPath(n);
        System.out.println(arr);
    }


    public static ArrayList<String> stairPath(int n){
        if(n == 0){
            ArrayList<String> bpath = new ArrayList<>();
            bpath.add("");
            return bpath;
        }else if(n < 0){
            ArrayList<String> bpath = new ArrayList<>();
            return bpath;
        }
        
        ArrayList<String> paths1 = stairPath(n - 1 );
        ArrayList<String> paths2 = stairPath(n - 2 );
        ArrayList<String> paths3 = stairPath(n - 3 );

        ArrayList<String> resPaths = new ArrayList<>();

        for(String path : paths1){
            resPaths.add(1 + path);
        }
        for(String path : paths2){
            resPaths.add(2 + path);
        }
        for(String path : paths3){
            resPaths.add(3 + path);
        }

        return resPaths;
    }
}
