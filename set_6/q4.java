//addtion of two matrix of 2X3

package set_6;

public class q4 {
    public static void main(String[] args) {

        int arr[][] = new int[2][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        int i = arr[0][0];
        int j = arr[1][0];
        System.out.println("MATRIX 1: ");
        for (i = 0; i <= arr.length - 1; i++) {
            for (j = 0; j <= arr[i].length - 1; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        int arr1[][] = new int[2][3];
        arr1[0][0] = 07;
        arr1[0][1] = 28;
        arr1[0][2] = 19;
        arr1[1][0] = 10;
        arr1[1][1] = 11;
        arr1[1][2] = 12;

        int k = arr1[0][0];
        int m = arr1[1][0];
        System.out.println("MATRIX 2: ");
        for (k = 0; k <= arr1.length - 1; k++) {
            for (m = 0; m <= arr1[k].length - 1; m++) {

                System.out.print(arr1[k][m] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("The sum of two matrix is: ");
        int s = arr[i][j];
        int p = arr1[k][m];
        int sum = s + p;
        System.out.println(s);
        System.out.println(p);
        System.out.println(sum);

    }
}
