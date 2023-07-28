import java.util.Scanner;

public class enCoding {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        printEnCoding(str,"");
        
    }

    public static void printEnCoding(String ques, String ans){
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }else if(ques.length() == 1){
            if(ques.charAt(0) == '0'){
                return;
            }else{
                String ch0 = ques.substring(0, 1);
                String roq0 = ques.substring(1);
                String code0 = (char)('a'+(Integer.parseInt(ch0) - 1))+"";
                printEnCoding(roq0, ans+code0);
            }
        }else{
            if(ques.charAt(0) == '0'){
                return;
            }else{
                String ch0 = ques.substring(0, 1);
                String roq0 = ques.substring(1);
                String code0 =  (char)('a'+ (Integer.parseInt(ch0) - 1))+ "";
                printEnCoding(roq0, ans + code0);

                String cho01 = ques.substring(0,2);
                String roq01 = ques.substring(2);
                String code01 = (char)('a'+(Integer.parseInt(cho01) - 1))+ "";
                if(Integer.parseInt(cho01) <= 26 ){
                    printEnCoding(roq01, ans + code01);
                }
            }
        }
    }
}
