public class SearchinRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = -1;
        int key = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == key ){
                target = i ; 
                
            } 
        }
        System.out.println("The target is found at index: " + target);
    }
}
