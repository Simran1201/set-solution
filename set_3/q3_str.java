package set_3;
import java.util.Scanner;
public class q3_str {
    public static void main(String[] args) {
     Scanner inp = new Scanner(System.in);
    
     System.out.print("Enter Your name: ");
     String letter = inp.nextLine();
     String str = "Dear name, Thanks a lot!!!";

     System.out.println(str.replace("name",letter));
    }    
}
