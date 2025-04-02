import java.util.Scanner;

public class StoreMarkAndRollNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[4][2];
        // Taking input for 
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Roll No. "+ "Marks");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+"     ");
            }
            System.out.println();
        }

    }
    
}
