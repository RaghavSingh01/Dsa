package assignments;

public class armstrongnum {
    public static void main(String[] args) {
        int num = 153;
        int ognum = num;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, 3);
            num /= 10;
        }
        if (sum == ognum) {
            System.out.println(ognum + " is an armstrong number.");
        }
        else{
            System.out.println(ognum + " is not an armstrong number.");
        }
            
        }
    }
    

