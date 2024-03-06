package assignments;

import java.util.Scanner;

public class Firstprogques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
    
    // Q.1. Whther the number is even or odd.
    
    //     System.out.println("Enter an integer: ");
    //     long num = sc.nextLong();
    //     if (num%2 ==0) {
    //         System.out.println("Its even.");
    //         }
    //         else{
    //             System.out.println("Its odd. ");
    //         }
    

    // Q.2. Greeting for a given name.
        // System.out.println("Enter your name : ");
        // String name = sc.nextLine();
        // System.out.println("Hello there, " + name);


        //Q.3. Find simple interest.

        // System.out.print("Enter the principle amount: ");
        // double P = sc.nextDouble();

        // System.out.println("Enter the time period: ");
        // double T = sc.nextDouble();

        // System.out.println("Enter the interest rate: ");
        // double R = sc.nextDouble();

        // Double SI = P*( 1 + R*T);
        // System.out.println( "Simple Interest is : " + (SI-P));


        //Q.4. Take operators as input

        // System.out.println("Enter the first number: ");
        // double num1 = sc.nextDouble();

        // System.out.println("Enter the second number: ");
        // double num2 = sc.nextDouble();

        // System.out.println("Enter the operator of your choice: ");
        // char op = sc.next().charAt(0);
        // double result = 0;
        // if (op == '+') {
        //    result= num1 + num2;
        //    System.out.println("Result is: " + result);
        // }
        // else if (op == '-'){
        //     result = num1 - num2;
        //     System.out.println("Result is: " + result);
        // }

        // else if (op == '*') {
        //     result = num1* num2;
        //     System.out.println("Result is: " + result);
        // }
        // else if (op == '/') {
        //     result = num1/num2;
        //     System.out.println("Result is: " + result);
        // }
        // else{
        //     System.out.println("INVALID INPUT!");
        // }
        

        // Q.5. Find larger number.

        // System.out.println("Enter the first number: ");
        // int a = sc.nextInt();
        
        // System.out.println("Enter the second number: ");
        // int b = sc.nextInt();

        // if (a<b) {
        //     System.out.println(b+" is greater than "+a);
        //     }
        //     else if (a == b){
        //         System.out.println("They are both equal.");
        //     }
        //     else {
        //         System.out.println(a+" is greater than "+b);
        //     }
    
        //Q.6. INR to USD.

        // System.out.println("Enter the amount: ");
        // double a = sc.nextDouble();
        // double result = a/82.98;
        // System.out.println("USD : "+result);


         //Q.8. To find out whether the given String is Palindrome or not.
         
         System.out.println("Enter any string:");
         String str = sc.nextLine();
         if (isPalindrome(str)) {
            System.out.println(str + " is palindrome string.");
         }
         else{
            System.out.println(str + " is not palindrome string.");
         }
    }
    static boolean isPalindrome(String str){
        int a = 0;
        int b = str.length() - 1;
        while (a < b) {
            if (str.charAt(a) != str.charAt(b)) {
                return false;
                   }
                a++;
                b--;

        }
        return true;
    }
}
