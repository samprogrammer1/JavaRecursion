import java.util.Scanner;

public class floodfill {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];

        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        scn.close();
        boolean[][] visited = new boolean[n][m];

        printFloodFill(arr, 0 , 0, "", visited);
    }

    public static void printFloodFill(int[][] array, int row, int col, String psf, boolean[][] visited) {
        if (row < 0 || col < 0 || row == array.length || col == array[0].length || array[row][col] == 1
                || visited[row][col] == true) {
            return;
        }

        if (row == array.length - 1 && col == array[0].length - 1) {
            System.out.println(psf);
            return;
        }

        visited[row][col] = true;
        printFloodFill(array, row - 1, col, psf+"t", visited);
        printFloodFill(array, row, col - 1, psf+"l", visited);
        printFloodFill(array, row + 1, col, psf+"d", visited);
        printFloodFill(array, row, col + 1, psf+"r", visited);
        visited[row][col] = false;
    };
}
