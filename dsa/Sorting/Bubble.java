package Sorting;

import java.util.Arrays;

public class Bubble {
    static void bubblesort(int[] arr){
        boolean  swapped;
        for(int i = 0 ;i < arr.length; i++){  //If the array is sorted already this will keep checking for all values of i which should not happen
            swapped = false;
            for(int j = 1 ; j < arr.length-i ; j++){
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                    
                }               
            }
            if (!swapped) {
                break;
            }
    }
  
}
public static void main(String[] args) {
 int[] arr = {3, 1, 5, 4, 2};
 bubblesort(arr);

 System.out.println(Arrays.toString(arr));
}    
}
