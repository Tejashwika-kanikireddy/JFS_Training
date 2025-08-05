import java.util.scanner;
public class MinValueInArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 5, 2, 8, 9, 12};
        int min = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; 
            }
        }
        System.out.println("Minimum value in the array: " + min);
    }
}
