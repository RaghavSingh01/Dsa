package assignments;

import java.util.Scanner;

public class factorsofnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.print("The factors of " + num + " are: ");
        for(int i = 1; i <= num; i++){
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
    
}
