package set_3;

import java.util.Scanner;
public class q1_str {
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
     System.out.print("Write the sentence:  ");
     String str = inp.nextLine();

     System.out.println("lower case: " + str.toLowerCase());
    }
}