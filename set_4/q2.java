package set_4;

import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int marktotal = 100;
        int sub = 3;
        int total = marktotal * sub;

        System.out.print("Enter the marks of 1st subject: ");
        float mark1 = inp.nextFloat();

        System.out.print("Enter the marks of 2nd subject: ");
        float mark2 = inp.nextFloat();

        System.out.print("Enter the marks of 3rd subject: ");
        float mark3 = inp.nextFloat();

        float totalmark = mark1 + mark2 + mark3;

        float percentofmark1 = (mark1 / marktotal) *100;
        float percentofmark2 = (mark2 / marktotal) *100;
        float percentofmark3 = (mark3 / marktotal) *100;

        System.out.println("Percentage of 1st subject: "+ percentofmark1 + " %");
        System.out.println("Percentage of 2nd subject: "+ percentofmark2 + " %");
        System.out.println("Percentage of 3rd subject: "+ percentofmark3 + " %");

        float percent = (totalmark / total) * 100;
        System.out.println("Percentage: " + percent + " %");

        if(percentofmark1 >=33 && percentofmark2 >= 33 && percentofmark3 >=33 && percent >= 40)
        {
            System.out.println("Congratulations!! You are \"PASS\" ");
        }
        else{
            System.out.println(" Try next time!! You are \"FAIL\"  ");
    }
    }

}