package set_6;

public class q6 {
    public static void main(String[] args) {
        
        int arr[] = { 1, 25, 36, 53, 89, 100, 52, 75, 11, 35 ,49 };
     
       for(int i : arr){
           if(i > arr[i]){
               System.out.println(i);
           }
       }
    }
}
