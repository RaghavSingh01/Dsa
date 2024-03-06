import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        
       int[] arr = {2 , 45 , 123 , 78 , 124};  //This is the creeation of an array.
    //    System.out.println(arr[3]);
          System.out.println(Arrays.toString(arr)); //Another simpler way to print the array. This .tostring() converts the array to string and then prints it.
        
    //    for(int i = 0; i< arr.length; i++)   //This for loop will iterate through each element in the array.
    //     {
    //         System.out.print(arr[i] + " ");     //Prints out each element of the  array with a space after it.
    // }
    
    for( int elements : arr){                    //This is an enhanced for loop ehich is called for each loop. It will go through every int element in array named arr.
        System.out.println(elements);
    }
}
}