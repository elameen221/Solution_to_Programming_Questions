import java.util.Arrays;
public class RotateArray {
    private static void arrayRotation(int[] arr, int order) {
        if (arr == null || order < 0) {
             throw new IllegalArgumentException("The array must be non-null and the order must be non-negative");
        }
        int offset = arr.length - order % arr.length;
        if (offset > 0) {
            int[] copy = arr.clone();
            for (int i = 0; i < arr.length; ++i) {
                 int j = (i + offset) % arr.length;
                 arr[i] = copy[j];
            }
        }
    }
    public static void main(String [] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
    arrayRotation(arr, 2);
    System.out.println(Arrays.toString(arr)); 
   
  }
}
