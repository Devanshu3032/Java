import java.util.Scanner;

public class AddTwoMatrices {public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);
    int[][] a = {{1,2},{3,4},{5,6}};
    int[][] b = {{11,22},{34,55},{19,23}};
    int[][] c = new int[3][2];
    for (int i = 0; i < c.length; i++) {
        for (int j = 0; j < c[0].length; j++) {
            c[i][j] = a[i][j]+b[i][j];
            
        }
        System.out.println(); 
    }
    for (int i = 0; i < c.length; i++) {
        for (int j = 0; j < c[0].length; j++) {
            System.out.print(c[i][j]+" ");
            
        }
        System.out.println();
    }

}
}

