package dsa;

import java.util.*;

public class repeatedprimes {
    
    // Function to check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input size of array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        // Input array elements
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Finding repeated prime numbers
        Set<Integer> primes = new HashSet<>();
        Set<Integer> repeatedPrimes = new HashSet<>();
        
        for (int i = 0; i < size; i++) {
            if (isPrime(arr[i])) {
                if (!primes.contains(arr[i])) {
                    primes.add(arr[i]);
                } else {
                    repeatedPrimes.add(arr[i]);
                }
            }
        }
        
        // Printing repeated prime numbers
        if (repeatedPrimes.isEmpty()) {
            System.out.println("No repeated prime numbers found.");
        } else {
            System.out.println("Repeated prime numbers in the array are:");
            for (int prime : repeatedPrimes) {
                System.out.print(prime + " ");
            }
        }
        
        scanner.close();
    }
}
