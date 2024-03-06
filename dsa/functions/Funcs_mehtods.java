package functions;
import java.util.Arrays;

public class Funcs_mehtods {
    public static void main(String[] args) {
        String name =  "Mehmet"; 
        changename(name);
        System.out.println(name);
        

        int a = 10;
        int b = 39;
        swap(a,b);

        System.out.println(a + " " + b);

        int[] arr= {2,3,4,2,8,0};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] nums){   //This worked because here a copy of reference value was passed and a change in copy will result in change in original value.
        nums[2] = 91;
    }



    static void swap(int a, int b){        //This will not give the swapped numbers in the above code because this will pass the values of objects ib the above code and the variables in a function are only used in that function only so there will be no change in the main function.
        int temp = a;
        a = b;
        b = temp;
    }

    // static int swap(int a , int b){       This one might work and give the swapped numbers 
    //     int  temp = a;
    //     a = b;
    //     b = temp;
    //     System.out.println(a + "  " +b );
    //     return a;
        
    // }


    static void changename(String name) {
     name = "YOYO";   //Did not change the name up there because strings are immutable and cannot be changed and these both names are different objects created.

    }

    
}
