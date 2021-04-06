package set_4;

import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the url: ");
        String url = inp.nextLine();

        if(url.endsWith(".com")){
            System.out.println("It is \"COmmercial Website\" ");
        } 
        else if(url.endsWith(".in")){
            System.out.println("It is \"INdian Website\" ");
        }
        else if(url.endsWith(".org")){
            System.out.println("It is \"ORGanization Website\" ");
        }
        else{
            System.out.println("It is \"another website\" ");
        }
    }
}
