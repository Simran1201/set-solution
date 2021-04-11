/*The sum of even number: */

package set_5;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        try {
            System.out.print("Enter the number: ");
            int num = inp.nextInt();

            int i = 0;
            int sum = 0;
            while (i <= num) {
                if (i % 2 == 0) {
                    System.out.println("Even no.: " + i);
                    sum = sum + i;
                }
                i++;
            }
            System.out.println("The Sum  of EVEN no. is: " + sum);

        } finally {
            inp.close();
        }
    }
}