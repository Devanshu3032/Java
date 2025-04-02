public class Adding2DArraywithoutThirdArray {
    public static void main(String[] args) {
         int[][] arr = {{1,2},{3,4},{5,6}};
         int[][] arr1 = {{11,22},{32,43},{56,63}};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                arr1[i][j] = arr[i][j]+arr1[i][j];
                
            }
            System.out.println();
            
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                System.out.print(arr1[i][j] +" ");
                
            }
            System.out.println();
        }
    }
}
