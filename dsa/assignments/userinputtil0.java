package assignments;

import java.util.ArrayList;
import java.util.Scanner;

public class userinputtil0 { 
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        ArrayList<Integer> list = new ArrayList<>();
        int n;
        int sum = 0;
        while ((n = sc.nextInt()) != 0) {
            list.add(n);
            for(int i =0; i < list.size(); i++){
                if (list.get(i) > list.get(i+1)) {
                    System.out.println(list.get(i)+ " is greater than "+ list.get(i + 1));
                } else if (list.get(i) == 0){
                    break;
                
                    
                }
            }
            sum += n;
            
        }
        System.out.println(sum);
}
    
}
