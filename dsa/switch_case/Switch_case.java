package switch_case;
import java.util.Scanner;
public class Switch_case {
    public static void main(String[] args) {
    Scanner  sc = new Scanner (System.in);
    System.out.println("Enter a car manufacturer name: ");
    String Car = sc.next();

//     switch (Car){                                                  This is the old way and takes too much time and is long.
//         case "Bugatti": 
//             System.out.println("French Supercar maker.");
//             break;
//         case "Koenigsegg":
//             System.out.println("Seddish Super car maker with an egg in its name.");
//             break;
//         case "Porsche":
//             System.out.println("German car maker which makes all kind of good cars.");
//             break;
//         case "BMW":
//             System.out.println("German car maker that don't make supercars but still defeat them.");
//             break;
//         default: 
//             System.out.println("Enter a good car maker");            
// }
    
// THIS IS THE NEW WAY OF WRITING SWITCH STATEMENTS WHICH IS SHORTER AND BETTER.
        switch (Car) {
            case "Bugatti" -> System.out.println("French Supercar maker.");
            case "Koenigsegg" -> System.out.println("Seddish Super car maker with an egg in its name.");
            case "Porsche" -> System.out.println("German car maker which makes all kind of good cars.");
            case "BMW" -> System.out.println("German car maker that don't make supercars but still defeat them.");
            default -> System.out.println("Enter a valid and good car manufacturer.");
            
        }
}
}
    

