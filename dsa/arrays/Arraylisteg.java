package arrays;
import java.util.Arrays;
import java.util.ArrayList;

public class Arraylisteg {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(24);                //This will add numbers to the list.
        list.add(43);
        list.add(143);
        list.add(62);
        list.add(35);
        list.add(15);

        list.set(0, 8247);     //This will change the number at 0 index.

        System.out.println(list);
    }
    
}
