package set_5;

import java.util.Scanner;

public class q11 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        try {
            System.out.print("Enter the number: ");
            int num = inp.nextInt();
            System.out.println("The even number is: ");

            int sum = 0;
            int i = 1;
            while (i <= num) {
                if (i % 2 == 0) {
                    System.out.println(i);
                    sum = sum + i;
                }
                i++;
            }
            System.out.println("The Sum of " + num + " even number is: " + sum);
        } finally {
            inp.close();
        }
    }
}
