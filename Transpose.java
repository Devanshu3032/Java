class Transpose{
 public static void main(String[] args) {
    int[][] arr = {{1,2},{3,4},{5,6}};
    for (int j = 0; j < arr[0].length; j++)  {  //rows
        for (int i = 0; i < arr.length; i++) { //cols
            System.out.print(arr[i][j]+" ");
            
        }
        System.out.println();
    }
 }
}