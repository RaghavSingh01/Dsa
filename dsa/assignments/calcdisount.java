package assignments;

import java.util.Scanner;

public class calcdisount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the original price of the item: ");
        int ogprice = sc.nextInt();
        System.out.println("Enter the discount: ");
        int discount = sc.nextInt();
        int discprice = (ogprice * discount)/100 ;
        System.out.println(discprice);
    }
    
}
