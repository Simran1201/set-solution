package set_6;

public class q5 {
    public static void main(String[] args) {
        int arr[][] = new int[2][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;

        System.out.println("orignal array:");
        int i;
        int j;
        for (i = 0; i <= arr.length - 1; i++) {
            for (j = 0; j <= arr[i].length - 1; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("reverse array: ");
        for (i = arr.length - 1; i >= 0; i--) {
            for (j = arr[i].length - 1; j >= 0; j--) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

}
