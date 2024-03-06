package assignments;

public class sumofn {
    public static void main(String[] args) {
       System.out.println( sum(5));
    }
    
    static int sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            
        }
        return sum;
    }
}
