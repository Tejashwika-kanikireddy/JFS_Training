import java.util.*;
public class DistinctValuesInArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 5, 2, 8, 9, 12};
        Set<Integer> distinctValues = new HashSet<>();
        for (int num : arr) {
            distinctValues.add(num);  
        }
        System.out.println("Distinct values in the array: " + distinctValues);
    }
}
