import java.util.ArrayList;
import java.util.Scanner;

public class getMazaPathsWithJump {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        scn.close();
        ArrayList<String> arr = getMazepath(1, 1, n , m);
        System.out.println(arr);
    }

    public static ArrayList<String> getMazepath(int sr , int sc , int dr , int dc){
        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        ArrayList<String> paths = new ArrayList<>();
        
        // horizontal move
        for(int ms = 1; ms <= dc - sc; ms++){
            ArrayList<String> hpaths = getMazepath(sr, sc + ms, dr, dc);
            for(String hpath : hpaths){
                paths.add("h" + ms + hpath);
            }
        }

        // veritical Path
        for(int ms = 1; ms <= dr - sr; ms++){
            ArrayList<String> vpaths = getMazepath(sr + ms , sc, dr, dc);
            for(String vpath : vpaths){
                paths.add("v" + ms + vpath);
            }
        }
        

        for(int ms = 1; ms <= dr - sr && ms <= dc - sc ; ms++){
            ArrayList<String> dpaths = getMazepath(sr + ms, sc + ms, dr, dc);
            for(String dpath : dpaths){
                paths.add("d" + ms + dpath);
            }
        }
        

        return paths;
    }
}
