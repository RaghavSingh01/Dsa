package assignments;

public class numpalindrome {
    public static void main(String[] args) {
        int x = 54634;
        isPalindrome(x);

    }
    static void isPalindrome(int n){
        int sum = 0;
        int og = n;
        while (n != 0) {

            int rem = n % 10;
            sum = (sum * 10) + rem;
            n /= 10;
        }
        if (og == sum) {
            System.out.println(og +" is a palindrome number");
        } else {
            System.out.println(og + " is not a palindrome number");
            
        }


    }
}

