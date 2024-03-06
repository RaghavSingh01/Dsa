package Strings;

import java.util.ArrayList;

public class Operator {
   public static void main(String[] args) {
    System.out.println('a' + 'b');   //Adds the Ascii value of a and b. a amd b are characters her not string.
    System.out.println("a" + "b");   // This concatenates the strings. Here, a nad b are strings and not characters.
    System.out.println('a' + 3 );    // Gives the ascii value of the character that is 3 ahead of a. i.e. d.
    System.out.println((char)( 'a' + 3));  //Converts the ascii value back to character so we get d.
    System.out.println("Hellu" + 1);  //This also concatenates them both because 1 is an integer which gets converted to Integer and later calls toString() method converting 1 to string.
    System.out.println("Hello" + new ArrayList<>() ); // Concatenates Hello with an empty list, gives "Hello[]".
    System.out.println("Hello" + 'u');

    //For the "+" operator to concatenate two dataypes they must either both be primitives or at least one of them hould be a string. Otherwise it won't work.
} 
}
