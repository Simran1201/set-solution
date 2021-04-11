package set_5;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        try {
            System.out.print("Enter the number: ");
            int x = inp.nextInt();
            int i = x;
            while (i >= 1) {
                int j = i;
                while (j >= 1) {
                    System.out.print("*");
                    j--;
                }
                System.out.println("");
                i--;
            }
        } finally {
            inp.close();
        }
    }
}
