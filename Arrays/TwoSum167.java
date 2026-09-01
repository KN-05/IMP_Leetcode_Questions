import java.util.*;
public class TwoSum167 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Array size
        int n = sc.nextInt();
        int[] numbers = new int[n];
        // Array input (sorted array)
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        // Two Pointer Approach
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                System.out.println((left + 1) + " " + (right + 1));
                break;
            } 
            else if (sum < target) {
                left++;
            } 
            else {
                right--;
            }
        }
        sc.close();
    }
}