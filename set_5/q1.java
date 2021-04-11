package set_5;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {

            System.out.print("Enter the number: ");
            int x = inp.nextInt();

            for (int i = x; i >= 1; i--) {
                for (int j = i; j >= 1; j--) {
                    System.out.print("*");
                }
                System.out.println("");
            }
            System.out.println("");
        } finally {
            inp.close();
        }
    }
}