import java.util.Scanner;

public class printKpc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        
        printKpc(str , "");
    }

    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static void printKpc(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);
        String roq = str.substring(1);

        String codeforech = codes[ch - '0'];
        for(int i = 0; i < codeforech.length(); i++){
            char cho = codeforech.charAt(i);
            printKpc(roq, ans + cho);
        }


    }
}
