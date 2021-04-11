package set_5;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        try{
            System.out.print("Enter the value: ");
            int num = inp.nextInt();

            int fact = 1;
            int i=1;
            while(i <= num){
                fact = fact * i;
                i++;
            }
            System.out.println(num + "!" + " = " + fact);
        }finally{
            inp.close();
        }
    }
}
