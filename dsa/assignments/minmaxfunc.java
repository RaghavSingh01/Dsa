package assignments;

import java.util.Scanner;

public class minmaxfunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = sc.nextInt();
        minmax(num1, num2, num3);
    }
    
    static void minmax(int a, int b , int c){
        if (a > b && b > c) {
            System.out.println(a + " is the max number.");
            System.out.println(c + " is the min number.");
}
        if (b > a  && a > c) {
            System.out.println(b + " is the max number.");
            System.out.println(c + " is the min number.");
        } 

        if (c > a && a > b) {
            System.out.println(c + " is the max number.");
            System.out.println(b + " is the min number.");
        }
        if (c > b && b > a) {
            System.out.println(c + " is the max number.");
            System.out.println(a  + " is the min number.");
            
        }
    }
}