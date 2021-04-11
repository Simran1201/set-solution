//Sorting of array is done or not
package set_6;

public class q8 {
    public static void main(String[] args) {

        int arr[] = { 11, 55, 89, 45, 10, 25, 49, 85, 95, 100, 35, 48 };
        int n = arr.length;
        int sort = arr[0];
        int sort1 = arr[n];
        for (int i = 0; i <= n; i++) {
            if (sort < arr[i] && sort1 >  arr[i]) {
              sort = arr[i];
            }
        }
        System.out.println(sort);
    }
}
