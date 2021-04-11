package set_5;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        try{
            System.out.print("Enter the value: ");
            int num = inp.nextInt();
            int fact = 1;
            for(int i=num; i>=1; i--){    
                fact = fact*i;
            }
            System.out.println(num + "!" + " = " + fact);
        }finally{
            inp.close();
        }
    }    
}
