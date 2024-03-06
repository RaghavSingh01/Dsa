package Strings;

public class SB {
    public static void main(String[] args) {
        // String yo = "";
        // for(int i = 0; i < 26; i++ ){
        //     char ch = (char)('a' + i);
        //     yo += ch;
        // }
        // System.out.println(yo);

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 26; i++ ){
            char ch = (char)('a' + i);
            sb.append(ch);
        }
        System.out.println(sb.toString());

    }
    
}
