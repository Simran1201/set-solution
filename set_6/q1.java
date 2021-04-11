package set_6;

public class q1 {
    public static void main(String[] args) {
        float[] arr = { 0.1f, 0.25f, 0.5458f, 0.85f, 0.978f };
        float sum = 0;

        for (int i = 0; i < 5; i++) {
            sum += arr[i];
            System.out.println(arr[i]);
        }
        System.out.println("The sum of given no. is: " + "  " + sum);
    }
}