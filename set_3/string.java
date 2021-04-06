package set_3;
import java.util.Scanner;
public class string {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Strings for : Hi! I am Simran ");

        String str = "Hi! I am Simran";

        System.out.println("1. Length: " + str.length());

        System.out.println("2. lower case: " + str.toLowerCase());

        System.out.println("3. UPPER CASE: " + str.toUpperCase());

        System.out.println("4. Substring(start index): " + str.substring(4));

        System.out.println("5. Substring (start)(end): " + str.substring(10, 15));

        System.out.println("6. Trim: " + str.trim());

        System.out.println("7. Replace: " + str.replace('a', 'b'));

        System.out.println("8. Starts with: " + str.startsWith("Hi"));

        System.out.println("9. EndsWith: " + str.endsWith("n"));
        
        System.out.println("10. Char at: " + str.charAt(6));

        System.out.println("11. index of: " + str.indexOf("s"));

        System.out.println("12. index of: " + str.indexOf("S", 5));

        System.out.println("13. Last index of: " + str.lastIndexOf("m"));

        System.out.println("14. Last index of: " + str.lastIndexOf("m", 5));

        System.out.println("15. Equal: " + str.equals("Simran"));

        System.out.println("16. Equals ignore case: " + str.equalsIgnoreCase("Simran"));

    }
}
