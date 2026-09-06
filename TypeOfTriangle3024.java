import java.util.*;

public class TypeOfTriangle3024 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nums = new int[3];

        System.out.println("Enter 3 sides:");

        for (int i = 0; i < 3; i++) {
            nums[i] = sc.nextInt();
        }

        // Triangle validity
        if (nums[0] + nums[1] <= nums[2] ||
            nums[1] + nums[2] <= nums[0] ||
            nums[0] + nums[2] <= nums[1]) {

            System.out.println("none");
        }
        // All three sides equal
        else if (nums[0] == nums[1] && nums[1] == nums[2]) {

            System.out.println("equilateral");
        }
        // Any two sides equal
        else if (nums[0] == nums[1] ||
                 nums[1] == nums[2] ||
                 nums[0] == nums[2]) {

            System.out.println("isosceles");
        }
        // All sides different
        else {

            System.out.println("scalene");
        }

        sc.close();
    }
}