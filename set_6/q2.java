//array present or not

package set_6;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        try {
            System.out.println("Enter the number: ");
            int num = inp.nextInt();

            int arr[] = { 01, 02, 07, 49, 58 };
            for(int i=0; i<= arr.length-1; i++){
                if(arr[i]==num){
                    System.out.println("Your number "+ num +" is present in array list.");
                }
                else{
                    System.out.println("not present");
                }
            }
        } finally {
            inp.close();
        }
    }
}
// for (int i : arr) {
//    if (i == num) {
//        System.out.println(num + " is present in array list");
//    }
//}