import java.util.*;

public class firstmissingpositive41 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Put every positive number at its correct index
        for (int i = 0; i < n; i++) {

            while (nums[i] > 0 && nums[i] <= n
                    && nums[nums[i] - 1] != nums[i]) {

                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        // Find first missing positive
        int answer = n + 1;

        for (int i = 0; i < n; i++) {

            if (nums[i] != i + 1) {
                answer = i + 1;
                break;
            }
        }

        System.out.println("First Missing Positive: " + answer);

        sc.close();
    }
}