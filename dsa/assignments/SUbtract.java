package assignments;

import java.util.Scanner;

public class SUbtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int num = sc.nextInt();
        System.out.println(ans(num));
    }

   static int ans(int num) {
        int sum = 0;
        int product = 1;
        while (num > 0) {
            int digit = num % 10;
            sum +=digit;
            product *= digit;
            num /= 10;
        }
        return product - sum;
    }
    }
    

