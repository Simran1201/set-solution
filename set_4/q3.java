package set_4;

import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        
    Scanner inp = new Scanner(System.in);

    System.out.print("Enter your Salary: ");
    float salary = inp.nextFloat();

    if(salary >=2500000 && salary < 5000000){
        float tax = (salary *5) /100;
        System.out.println("You have to pay 5% of your salary is total: "+ tax);
    }
    else if(salary >=5000000 && salary<10000000){
        float tax1 = (salary *20) /100;
        System.out.println("You have to pay 20% of your salary is total: "+ tax1);
    }
    else if(salary >= 10000000){
        float tax3 = (salary *30) /100;
        System.out.println("You have to pay 5% of your salary is total: "+ tax3);
    }
    else{
        System.out.println("You not have to pay TAX!!");
    }
 }
}
