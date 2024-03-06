package assignments;

public class palindromestring {
    public static void main(String[] args) {
        String str = "nitin";
        String s = reverse(str);
        System.out.println(s);
    }
    static String reverse( String str){
        // for (int i = 0; i < str.length(); i++) {
        //     for (int j = str.length() - 1; j > 0 ; j--) {
        //         if (str.charAt(i) == str.charAt(j)) {
        //             return str + " is palindrome.";
        //         }
        //     }
        //        }       return"It is not palindrome.";
                
                
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return str + " is not a palindrome.";
            }
        }
        return str + " is a palindrome.";
            }
            
        }
    

