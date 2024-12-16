package leetcode;

import java.util.Arrays;

public class P3024 {
  public String triangleType(int[] nums) {
    Arrays.sort(nums);
    if (nums[0] == nums[1] && nums[1] == nums[2]) {
      return "equilateral";
    } else if (nums[0] + nums[1] <= nums[2]) {
      return "none";
    } else if (nums[0] == nums[1] || nums[1] == nums[2]) {
      return "isosceles";
    } else {
      return "scalene";
    }
  }
}
