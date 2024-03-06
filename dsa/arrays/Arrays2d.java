package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2d {
    public static void main(String[] args) {
        // int[][] arr2d = new int[3][3];                             //Here the number of rows and columns is fixed.
        // Scanner sc = new Scanner(System.in);

        // for(int row= 0 ; row< arr2d.length ; row++) {            //This is the input.
        //     for(int col=0 ; col<arr2d[row].length ; col++){
        //         arr2d[row][col] = sc.nextInt();
             
        //     }
        // }

    // }
    //     for(int row= 0 ; row< arr2d.length ; row++) {            //This is one way to write the array but this does not represent it in a clean way.
    //         for(int col=0 ; col<arr2d[row].length ; col++){
    //             arr2d[row][col] = sc.nextInt();
    //             System.out.print(arr2d[row][col] + " ");
    //         }
    //         System.out.println();

    // }

    // for(int row = 0; row< arr2d.length ; row++){                   //Cleaner way to write arrays and it will represent it in a form of an array somewhat.
    //     System.out.println(Arrays.toString(arr2d[row]));
    // }
    

//     for(int[] a:  arr2d){                                       //This is for each loop and works the same way as the above.
//         System.out.println(Arrays.toString(a));        //This for each loop was used in such a way because we use the datatype of elements inside an array in the loop and here every element is an array itself.  
// }


    int[][] arr = {                 //Here the number of rows is fixed but not the number of columns.
        {1,2,3},
        {4,5},
        {6,7,8,9}
    };

    for(int row=0; row<arr.length; row++){
        for(int col = 0; col<arr[row].length;  col++ ){
            System.out.print(arr[row][col] + " ");
    }
    System.out.println();
}
}
}