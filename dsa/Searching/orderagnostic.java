package Searching;

public class orderagnostic {
    public static void main(String[] args) {
        int[] arr= {534, 423,321, 300,123,54,43,12,6,4};
        int target = 123;
        int result = agnosticbs(arr, target);
        System.out.println(result);

    }
    
    static int agnosticbs(int[] arr, int t){
        int start = 0;
        int end = arr.length -1;
        boolean isAsc = arr[start] < arr[end];
while (start <= end) {
    

        int mid = start + (end - start)/2;
    
        if (arr[mid] == t) {
            return mid;
            
        }
        if (isAsc) {
            if (arr[mid] >t) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
                
            }
            
         }
         else{
            if (arr[mid] >t) {
                start = mid + 1;
            }
            else{
                end = mid -1 ;
            }
         }
        
    }
    return -1;
}
}