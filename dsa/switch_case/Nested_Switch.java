import java.util.Scanner;

public class Nested_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the car manufacturer: ");
        String Car = sc.next();
        System.out.println("Enter the type : ");
        String type = sc.next();
        switch (Car) {
            case "Bugatti" -> {System.out.println("French car manufacturer. ");
                switch (type) {
                    case "Electric" -> System.out.println("Going to make only shit electric cars in future");
                    case "Fuel" -> System.out.println("Made one of the best w16 engine with 1500hp.");
                }
                }
            case "Porsche" -> System.out.println("German car maker said not shifting to electric and maintaining manual engines. But, makes some standalone electric cars. ");
            case "BMW" -> System.out.println("German car maker making supercar destroying sportscars but getting rid of manual transmission ");
            case "Koenigsegg" -> System.out.println("Swedish madman giving automatic and manual transmission in same car abd gicing 2300 hp to family 4 seater.");
            default -> System.out.println("Enter a good and valid car maker");        }
    }
    
}
