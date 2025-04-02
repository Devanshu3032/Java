import java.util.Scanner;

public class Max1Element {
    public static void main(String[] args) {
        // int[][] arr = new int[2][2];
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{1,2},{10,4}};
        int largest = 0;
        // // for (int i = 0; i < arr.length; i++) {
        // //     for (int j = 0; j < arr[0].length; j++) {
        // //         arr[i][j] = sc.nextInt();
        // //     }
        // //     System.out.println();
        // }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]>largest){
                    largest = arr[i][j];
                }
              
            }
           
        }
        System.out.println(largest);
    }
    
    
}
