import java.util.Arrays;
public class NumberofDistinctUsingStreams {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 5, 2, 8, 9, 12};
        long distinctCount = Arrays.stream(arr).distinct().count();      
        System.out.println("Number of distinct values using streams: " + distinctCount);
    }
}
