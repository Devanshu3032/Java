public class MaxElement {
    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}} ;
        int max = 0 ;
        int secMax = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if(A[i][j]>max){
                    max = A[i][j];
                }
                if(A[i][j]<max && max>secMax ){
                    secMax = A[i][j];
                }
            }
            
        }
        System.out.println(max);
        System.out.println(secMax);
    }
    
}
