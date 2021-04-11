//Average of subject marks

package set_6;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        try {
            int[] arr = { 40, 50, 60, 70, 80, 75, 95, 33, 20 };

            int sum = 0;
            for (int i : arr) {
                sum = sum + i;
            }
            float a = sum / arr.length;
            System.out.println("The average of physics subject marks is: " + a);
        } finally {
            inp.close();
        }
    }
}