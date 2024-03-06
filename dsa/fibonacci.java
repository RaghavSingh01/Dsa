import java.util.Scanner;

public class fibonacci {
    
    public static void main(String[] args) {
        // int n= 10;                                                       //Also correct but more complex and longer.
        // int[] fibseries = new int[n];
        // fibseries[0] = 0;
        // fibseries [1] = 1;
        // System.out.print(fibseries[0] + " ");
        // System.out.print(fibseries[1] + " ");
        // for (int i = 2 ; i < n ; i++) {
        //     fibseries[i] = fibseries[i-1] + fibseries[i-2];
        //     System.out.print(fibseries[i] + " " );    
        // }
           
            Scanner sc = new Scanner(System.in);                        //Easier method to do fibonacci series.
            int n = sc.nextInt();
            int a= 0;
            int b= 1; 
            int i =0;
            System.out.print(a +" ,");  
            while (i <= n) {
                int c = b;
                b = a+b;
                a = c;
                i ++; 
                System.out.print(c+", ");
                
            }
            

    }
    
}
