package assignments;

public class compint {
    public static void main(String[] args) {
        int amt = 200000;
        int interest = 10;
        int time = 5;
        int n = 1;
        int result = compound(amt, interest, n, time);
        System.out.println(result);
    }
    static int compound(int P , int r , int n, int t){
        int compinterest =P*(1 + r/n)^(n*t);
        return compinterest;
    }
}
