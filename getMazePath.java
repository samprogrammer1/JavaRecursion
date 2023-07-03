import java.util.ArrayList;
import java.util.Scanner;

public class getMazePath {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        scn.close();
        ArrayList<String> paths =  MazePaths(1 , 1 , n , m);

        System.out.println(paths);
    }

    public static ArrayList<String> MazePaths(int sr , int sc , int dr , int dc){
        if(sr == dr && sc == dc){
            ArrayList<String> bpath = new ArrayList<>();
            bpath.add("");
            return bpath;
        }

        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();

        if(sc < dc){
            hpaths = MazePaths(sr , sc + 1 , dr , dc);
        }
        if(sr < dr){
            vpaths = MazePaths(sr+1, sc, dr, dc);
        }

        ArrayList<String> paths = new ArrayList<>();

        for (String hpath: hpaths) {
            paths.add("h" +hpath);
        }
        for (String vpath: vpaths) {
            paths.add("v" +vpath);
        }

        return paths;
    }
}
