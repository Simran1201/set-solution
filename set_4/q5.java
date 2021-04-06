package set_4;

import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the Year: ");
        int year = inp.nextInt();

        int leap = year % 4;
        if(leap == 0){
            System.out.println("Year entered by you is \"LEAP YEAR\" ");
        }
        else{
            System.out.println("Year entered by you is \" not LEAP YEAR\" ");
        }
    }
}
