import java.util.ArrayList;
import java.util.Scanner;

public class getKpc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        scn.close();
        ArrayList<String> words = getKpcValue(str);
        System.out.println(words);
    }

    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static ArrayList<String> getKpcValue(String str){
        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        
        char ch = str.charAt(0); //1
        String ros = str.substring(1); //2

        ArrayList<String> rres = getKpcValue(ros); //3
        ArrayList<String> mres = new ArrayList<>(); //4

        String codeFocus = codes[ch -'0']; //5
        for(int i = 0; i < codeFocus.length(); i++){ //6
            char codeFocusString = codeFocus.charAt(i);
            for (String rstr : rres) {
                mres.add(codeFocusString + rstr);
            }
        }

        return mres;
    }
}
