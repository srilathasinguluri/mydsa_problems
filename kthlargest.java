package dsa;

import java.util.*;

public class kthlargest {// kth largest element in array using quick select

    public static int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 1 || k > nums.length)
            throw new IllegalArgumentException("Invalid input");

        return quickSelect(nums, 0, nums.length - 1, nums.length - k);
    }

    private static int quickSelect(int[] nums, int start, int end, int k) {
        if (start == end)
            return nums[start];

        int pivotIndex = partition(nums, start, end);
        
        if (k == pivotIndex)
            return nums[k];
        else if (k < pivotIndex)
            return quickSelect(nums, start, pivotIndex - 1, k);
        else
            return quickSelect(nums, pivotIndex + 1, end, k);
    }

    private static int partition(int[] nums, int start, int end) {
        int pivotIndex = start + new Random().nextInt(end - start + 1);
        int pivot = nums[pivotIndex];
        swap(nums, pivotIndex, end);

        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (nums[j] <= pivot) {
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i + 1, end);
        return i + 1;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        
        int result = findKthLargest(nums, k);
        System.out.println("The " + k + "th largest element is: " + result);
        
        scanner.close();
    }
}
 