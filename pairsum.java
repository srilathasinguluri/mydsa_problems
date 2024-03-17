package dsa;
import java.util.*;

public class pairsum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Target sum
        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();

        // Finding pairs
        PairSum(arr, target);

        scanner.close();
    }

    public static void PairSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                System.out.println("["+complement +","+ arr[i]+"]");
            }
            map.put(arr[i], i);
        }
    }
}
