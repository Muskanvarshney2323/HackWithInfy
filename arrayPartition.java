import java.util.*;
public class arrayPartition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: array size
        System.out.println("Enter number of elements in the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Sort the array
        Arrays.sort(arr);

        // Calculate the sum of pairs
        int sum = 0;
        for (int i = 0; i < n; i += 2) {
            sum += arr[i];
        }

        System.out.println("The sum of the minimums of pairs is: " + sum);
    }
    
}
