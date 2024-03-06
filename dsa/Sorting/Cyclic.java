package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.numsays;

public class Cyclic {
    // static void cyclic(int[] nums){
    //     int i = 0;
    //     while (i < nums.length) {
    //         int correct = nums[i] - 1;           //For numbers in range between 1 to N.
    //         if (nums[i] != nums[correct]) {
    //             swap(nums, i, correct);
    //             }
    //             else{
    //                 i++;
    //             }
    //     }
    // }

//     //Question for cyclic sort--> Find the missing number. Number (0,N).
//      static int findMissingNumber(int []nums){
//        int i=0;
//         while(i < nums.length){
//             int correct = nums[i];
//             if (nums[i] < nums.length && nums[i] != nums[correct]) {
//                 swap(nums, i, correct);                
//             }
//             else{
//                 i++;
//             }
          
//             }
//             for(int j=0 ; j < nums.length ; j++){
//                 if (nums[j] != j) {
//                     return j;
//                 }
//         }
//         return nums.length;
// }
//     public static int findDisappearedNumbers(int[] nums) {  //This found repeated numbers in an array
// int i=0;
//         while(i < nums.length){
//             int correct = nums[i] -1;
//             if (nums[i] != nums[correct]) {
//                 swap(nums, i, correct);                
//             }
//             else{
//                 i++;
//             }
//         }
//             int ans = 0;
//             for( int j = 0; j < nums.length; j++){
//                 if( nums[j] != j+1){
//                     ans = nums[j];
//                 }
//             }
            
//             return ans;
//     }


//Q Find the first missing positive number
static int findMissingNumber(int []nums){
    int i=0;
     while(i < nums.length){
         int correct = nums[i] - 1;
         if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
             swap(nums, i, correct);                
         }
         else{
             i++;
         }
       
         }
         for(int j=0 ; j < nums.length ; j++){
             if (nums[j] != j + 1) {
                 return j + 1;
             }
     }
     return nums.length + 1;
}


    static void swap( int[] nums , int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public static void main(String[] args) {
        // int[] nums = {3, 1, 4, 2, 5, 6 };
        // cyclic(nums);
        // System.out.println(numsays.toString(nums));
    
        int[] nums = {3,1,3,4,2};
        System.out.println(findMissingNumber(nums));
        
         
        // System.out.println(numsays.toString(nums));
     
    }
    
}
