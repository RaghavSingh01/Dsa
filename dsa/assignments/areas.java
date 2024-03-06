package assignments;

import java.util.Scanner;

public class areas {
    static int circlearea(int r){
        return r*r;
    }
    static int areatriangle(int base, int height){
        return (base * height)/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the radius: ");
        // int radius = sc.nextInt();
        // System.out.println("The area of the circle is: " + circlearea(radius));
        
        System.out.println("Enter the base: ");
        int b = sc.nextInt();
        System.out.println("Enter the height: ");
        int h = sc.nextInt();
        System.out.println("The area of the triangle is: " + areatriangle(b,h));
    }
    
}
