package Strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "John Doe";
        System.out.println(name.indexOf('o'));
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    
}
