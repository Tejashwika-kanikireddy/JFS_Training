import java.util.Arrays;
public class MinValueUsingStreams {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 5, 2, 8, 9, 12};
        int min = Arrays.stream(arr).min().orElse(Integer.MIN_VALUE); 
        System.out.println("Minimum value using streams: " + min);
    }
}
