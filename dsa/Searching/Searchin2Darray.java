package Searching;

import java.util.Arrays;

public class Searchin2Darray {

    static int[] Search(int[][] arr, int target){
        if (arr.length == 0) {
            return new int[]{-1,-1};
            
        }

        for (int i = 0; i < arr.length; i++) {
            for( int j=0; j< arr[i].length; j++ ){
                if (arr[i][j] == target) {
                    return  new int[]{i, j};
                }
        }
    }
        return null;
}
    public static void main(String[] args) {
        int[][] arr = {
            {1, 3, 5, 7},
            {24,51,76},
            {61,58,12,35,75}
        };
        int target = 75;
        int[] result = Search(arr, target);
        System.out.println(Arrays.toString(result));
    }
    
}
