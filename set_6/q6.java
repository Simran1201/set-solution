//Find the minimum no.
package set_6;

public class q6 {
    public static void main(String[] args) {


        int arr[] = { 1, 25, 36, 53, 89, 100, 52, 75, 11, 35, 49 };
        int i;
        int max = arr[0];
        for (i = 1; i < arr.length - 1; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println("The Maximum number in array is: " + max);
    }
}