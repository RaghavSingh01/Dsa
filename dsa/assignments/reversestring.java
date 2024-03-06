package assignments;

public class reversestring {
    public static void main(String[] args) {
    String str = "Hello, World";
    StringBuilder sb = new StringBuilder(str);
    String reversed = sb.reverse().toString();
    System.out.println(reversed);    
    }
    
}
