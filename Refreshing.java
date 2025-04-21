// import java.util.Scanner;

public class Refreshing {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
        int m = arr.length;
        // Scanner sc = new Scanner(System.in);
        // for (int i = 0; i < arr.length; i++) {
        //     for(int j = 0; j < arr[0].length; j++)
        //     arr[i][j] = sc.nextInt();
        // }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
           
        }

        System.out.println();
        // transposing
        for (int i = 0; i < arr[0].length; i++)
             {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[j][i] + " ");
                    
                }
                System.out.println();
                
            }

            System.out.println();
            for (int i = 0; i < m; i++) {
                int a =  0  , b = m-1;
                // Swaping a[i][a] and arr[i][b]
             while (a<b) {
                int temp = arr[i][a] ; 
                arr[i][a] = arr[i][b];
                arr[i][b] = temp ;
                 a++ ;
                 b-- ;
                
             }
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            
        }
    }

