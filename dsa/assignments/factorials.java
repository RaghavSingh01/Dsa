package assignments;

public class factorials {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    static int factorial(int n){
        
            if( n==0){
                return 1;
            }
            else{
                 n = n * factorial(n-1);
                return n;
            }
    
    } 
}

