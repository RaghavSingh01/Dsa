package assignments;

public class oddeven {
    public static void main(String[] args) {
     int n = 327402;
     oddeve(n);   
    }
    
    static void oddeve(int n){
        if ( n % 2 == 0 ){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
}
}