public class Converter {
    
    /**
     * Converts ounces to decimal pounds.
     * @param ounces the number of ounces to convert
     * @return a string representation of pounds in decimal format
     */
    public String toPounds(int ounces) {
        double pounds = ounces / 16.0;
        
        // Format to 4 decimal places
        String formatted = String.format("%.4f", pounds);
        
        // Use singular "lb" if exactly 1 pound, otherwise "lbs"
        if (pounds == 1.0) {
            return formatted + " lb";
        } else {
            return formatted + " lbs";
        }
    }
    
    /**
     * Converts ounces to pounds and remaining ounces.
     * @param ounces the number of ounces to convert
     * @return a string representation of pounds and ounces
     */
    public String toPoundsAndOunces(int ounces) {
        int pounds = ounces / 16;  // Integer division
        int remainingOunces = ounces % 16;  // Modulo operator
        
        // Build the output string
        String result = pounds + " ";
        
        // Handle singular vs plural for pounds
        if (pounds == 1) {
            result += "lb ";
        } else {
            result += "lbs ";
        }
        
        result += remainingOunces + " oz";
        
        return result;
    }
}