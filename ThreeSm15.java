import java.util.*;
public class ThreeSm15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array size input
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Array input
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Sort array
        Arrays.sort(nums);

        System.out.println("Triplets are:");

        // 3Sum Logic
        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    System.out.println(nums[i] + " " + nums[left] + " " + nums[right]);

                    // Skip duplicates
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                }
                else if (sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
    }
}