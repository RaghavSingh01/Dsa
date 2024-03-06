package Sorting;

import java.util.Arrays;

public class Selection {
    static void selection(int[] arr ){
        for( int i = 0 ; i< arr.length ; i++){
        int last = arr.length - i - 1;
        int max = getmax(arr, 0 , last);
        swap(arr , max , last);
    }
}

    static void swap(int[] arr , int one , int two) {
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }

    static int getmax(int[] arr, int start , int end ){
        int maximum = start;
        for(int i=0 ; i<= end ; i++){
            if (arr[maximum] < arr[i]) {
                maximum = i;
                
            }
        }
        return maximum;
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 1, 3};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }
    
}
