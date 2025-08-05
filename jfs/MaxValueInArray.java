import java.util.Scanner;
public class MaxValueInArray {
        public static void main(String[] args) {
        int[] arr = {1, 1, 3, 5, 2, 8, 9, 12};
        int max = arr[0]; 
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; 
            }
        }
        System.out.println("Maximum value in the array: " + max);
    }
}
