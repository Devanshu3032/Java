public class PeakElementM3 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int peak = 0 ; 
        int max = Integer.MIN_VALUE ;
        for(int i = 0 ; i < arr.length ; i++){
           if(arr[i] > max ){
               max = arr[i] ; 
               peak = i0000 ;
           }
        }
        System.out.println("Peak Element is: " + peak);
    }
}