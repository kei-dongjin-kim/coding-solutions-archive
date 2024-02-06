package leetcode;

public class P2016 {
    public int maximumDifference(int[] nums) {

        int max = 0;

        for (int i=0 ; i<nums.length ; i++) {
            for (int j=i+1 ; j<nums.length ; j++) {
                // max = Math.max(max, nums[j] - nums[i]);
                if (nums[j] - nums[i] > max)
                    max = nums[j] - nums[i];
            }
        }

        return max == 0 ? -1 : max;
    }
}
