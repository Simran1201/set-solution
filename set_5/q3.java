/* Mutliplication of given no. */

package set_5;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            System.out.print("Enter the Number: ");
            int num = inp.nextInt();

            for (int i = 1; i <= 10; i++) {
                int multiply = num * i;
                System.out.println(num + " x " + i + " = " + multiply);
            }

        } finally {
            inp.close();
        }
    }
}