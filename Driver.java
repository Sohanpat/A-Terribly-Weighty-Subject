import java.util.Scanner;

public class Driver {
    
    public static void main(String[] args) {
        // Create scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Create converter object
        Converter converter = new Converter();
        
        // Welcome message
        System.out.println("Welcome to the Ounce Conversion Program!");
        System.out.println();
        
        // Prompt for input
        System.out.print("How many ounces do you have? ");
        int ounces = scanner.nextInt();
        
        // Confirmation message
        System.out.println("Thank you! Converting ounces to pounds.");
        System.out.println();
        
        // Display conversions
        System.out.println(ounces + " oz is equivalent to " + 
                          converter.toPoundsAndOunces(ounces) + ".");
        System.out.println(ounces + " oz is equivalent to " + 
                          converter.toPounds(ounces) + ".");
        System.out.println();
        
        // Exit message
        System.out.println("Thank you for using the OCP!");
        
        // Close scanner
        scanner.close();
    }
}