package Searching;

import java.util.Arrays;

public class linear_search {
/* Q.1.
    static int Linear_Search(int[] arr, int target){         //For integer array.
        if(arr.length == 0){
            return -1;
        }
        for(int i=0; i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    
    static boolean Linear_Search2(int[] arr, int target){       //For integer array.
            if(arr.length == 0){
                return false;
            }
            for(int elements: arr){
                if(elements == target){
                    return true;
                }
            }
            return false;       //If none of the conditions are met this will run.
    
    }*/

/* Q.2.
    static boolean Search(String str, char target){      //For finding characters in strings.
        if(str.length() == 0){
            return false;
        }
        for (char ch : str.toCharArray()) {               //Normal for loop can also be used.
            if (ch == target) {
                return true;
    }
    }
    return false;
}*/

//Q.3.
static int min_num(int[] arr){
    int ans = arr[0];
    if (arr.length==0){
        System.out.println("Invalid array");
    }
    for (int i = 1; i < arr.length; i++) {
        if (ans > arr[i]) {
            ans = arr[i];
            
        }
    }
    return ans;
}
    public static void main(String[] args) {
        // int[] nums = {387,345,64,23,51,321,1,2,4,34};
        // int target = 23;
        // String name = "raghav";
        // char ch = 'a';  
        // System.out.println(Arrays.toString(name.toCharArray()));   //Converts the string "raghav" into an array of characters.

        // System.out.println(Linear_Search(nums, target));
        // System.out.println(Linear_Search2(nums, target));
        // System.out.println(Search(name, ch));

        int[] nums = {34,12,54,7,11,80,241,-12,35,24};
        System.out.println(min_num(nums));
    }
    
}
