package Strings;

public class Basics {
    public static void main(String[] args) {
        String a = "Ram";
        String b = "Ram";
        System.out.println(a == b);
        //This gave true because Strings with the same objects don't create new object for both variables and store them as one object in the string pool.

        String c = new String("Krishn");
        String d  = new String("Krishn");
        System.out.println(c == d);
        //This gave false because we used new keyword to make different objects for both variables , so they are not equal. These objects created will be outside the pool.

        System.out.println(c.equals(d)); // .equals is used to compare the actual content of two strings. So, this will give true because their value is same.
        System.out.println(c.charAt(0));
    }
    
}
