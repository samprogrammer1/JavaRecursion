import java.util.Scanner;

public class printNQueens {
    
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] chess = new int[n][n];

        nQueensPrint(chess , "" , 0);
    }

    public static void nQueensPrint(int[][] chess, String ans , int row){
        if(row == chess.length){
            System.out.println(ans + " .");
            return;
        }

        for(int col = 0; col < chess.length; col++){
            if(isITasafePlace(chess, row, col) == true){
                chess[row][col] = 1;
                nQueensPrint(chess, ans + row +"-"+col+",", row+1);
                chess[row][col] = 0;
            }
        }
    }

    public static boolean isITasafePlace(int[][] chess, int row, int col){
        for(int i = row - 1, j = col; i >= 0 ; i--){
            if(chess[i][j] == 1){
                return false;
            }
        }

        for(int i = row -1 , j = col - 1; i >= 0 && j >= 0; i-- , j--){
            if(chess[i][j] == 1){
                return false;
            }
        }

        for(int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++){
            if (chess[i][j]==1) {
                return false;
            }
        }

        return true;
    }
}
