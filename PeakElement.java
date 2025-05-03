public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int peak = 0 ; 

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                if (arr[i] > arr[i + 1]) {
                    peak = i ;
                }
            } else if (i == arr.length - 1) {
                if (arr[i] > arr[i - 1]) {
                    peak = i;
                }
            } else {
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    peak = i;
                }
            }
        
        }
        System.out.println("Peak Element is: " + peak);
        
    }


}