package assignments;

import java.util.Scanner;

public class avgofnnums {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        int n = st.nextInt();
        int sum = 0;
        int result = 0;
        for (int i = 0; i <= n ;i++) {
            sum += i;
            result = sum/n;
        }
        System.out.println(result);
    }
   
}
