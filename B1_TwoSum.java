import java.util.Arrays;
import java.util.Vector;

public class B1_TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] index = { -1, -1 };
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    index[0] = i;
                    index[1] = j;
                    return index;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 4 };
        int Target = 6;
        System.out.println(Arrays.toString(twoSum(nums, Target)));

    }

}
