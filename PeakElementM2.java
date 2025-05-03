public class PeakElementM2 {
    public static void main(String[] args) {
        int peak = 0 ;
        int[] arr = {1,2,3};
        for(int i = 0 ; i < arr.length ; i++){
            for( int j = i+1 ; j < arr.length ; j++){
                int temp = 0 ; 
                if(arr[j] < arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j] ; 
                    arr[j] = temp ; 
                }
            }
        }
        peak = arr.length -1 ; 
        
        
    }
}
