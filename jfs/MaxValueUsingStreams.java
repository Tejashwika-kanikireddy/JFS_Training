import java.util.Arrays;
public class MaxValueUsingStreams {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 5, 2, 8, 9, 12};
        int max = Arrays.stream(arr).max().orElse(Integer.MIN_VALUE); 
        System.out.println("Maximum value using streams: " + max);
    }
}
