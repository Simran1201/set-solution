//Find the minimum no.
package set_6;

public class q7{
    public static void main(String[] args) {
        
        int arr[] = { 45, 25, 65, 89, 45, 11, 75, 10, 1, 35, 587, 10, 8};
        int min  = arr[0];
        for(int i=1; i <=arr.length-1; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The minimum value of an array is: " + min);
    }
}