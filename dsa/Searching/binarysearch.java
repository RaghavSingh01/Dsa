package Searching;

public class binarysearch {
    static int BinarySearch(int[] arr, int a){
        int start = 0;
        int end = arr.length -1 ;
      
        while( start <= end ) {
            int mid = start + ( end - start ) / 2;
            if (arr[mid] < a) {
                start = mid + 1;
            }
            else if (arr[mid] > a) {
                end = mid -1 ;                
            }
            else {
                return mid;
            }
          
            }
            return -1;
        }
    
    public static void main(String[] args) {
        
        int[] arr = {2, 3, 12, 23, 32, 33, 43, 53, 64 ,123};
        int target= 43;
        int result = BinarySearch(arr,target);
        System.out.println(result);
    }
}   

