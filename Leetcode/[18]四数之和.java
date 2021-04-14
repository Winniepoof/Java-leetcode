//给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，使得 a + b + c +
// d 的值与 target 相等？找出所有满足条件且不重复的四元组。 
//
// 注意： 
//
// 答案中不可以包含重复的四元组。 
//
// 示例： 
//
// 给定数组 nums = [1, 0, -1, 0, -2, 2]，和 target = 0。
//
//满足要求的四元组集合为：
//[
//  [-1,  0, 0, 1],
//  [-2, -1, 1, 2],
//  [-2,  0, 0, 2]
//]
// 
// Related Topics 数组 哈希表 双指针


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> les = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        if (nums.length<4||nums==null) return les;
        for (int i=0;i<nums.length-3;i++){
            if (i> 0 && nums[i] == nums[i - 1]) continue;
            for (int j=i+1;j<nums.length-2;j++) {
                if (j > i+1 && nums[j] == nums[j - 1]) continue;
                int high = nums.length - 1, low = j + 1;
                while (low < high) {
                    int sum = nums[i] + nums[j] + nums[low] + nums[high];
                    if (sum == target) {
                        les.add(Arrays.asList(nums[i], nums[j], nums[low], nums[high]));
                        low++;
                        high--;
                        while ((low < high && nums[low] == nums[low - 1])) low++;
                        while ((low < high && nums[high] == nums[high + 1])) high--;

                    } else if (sum < target) {
                        low++;
                    } else high--;
                }
            }
        }
        return les;

    }
}
//leetcode submit region end(Prohibit modification and deletion)
