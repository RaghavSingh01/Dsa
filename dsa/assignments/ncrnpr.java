package assignments;

public class ncrnpr {
    public static void main(String[] args) {
     int n = 5;
     int r = 3;
     int s = n - r;
     //int result = (factorial(n)) / (factorial(s)) ;       This was for npr
     int result = (factorial(n)) / ((factorial(s)) * (factorial(r)));   //This is for ncr
     System.out.println(result); 
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
