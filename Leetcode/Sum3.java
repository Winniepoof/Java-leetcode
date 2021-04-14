//三数之和
//给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
//注意：答案中不可以包含重复的三元组。
//示例：
//给定数组 nums = [-1, 0, 1, 2, -1, -4]，
//满足要求的三元组集合为：
//  {[-1, 0, 1], [-1, -1, 2]}
package Leetcode;
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> les = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int low = i + 1, high = nums.length - 1, sum = 0 - nums[i];
            if (nums[low] + nums[high] == sum) {
                les.add(Arrays.asList(nums[i], nums[low], nums[high]));
                while ((low < high && nums[low] == nums[low + 1])) low++;
                while ((low < high && nums[high] == nums[low - 1])) high--;
                low++;
                high--;
            } else if (nums[low] + nums[high] < sum) {
                low++;
            } else high--;
        }
        return les;
    }

    public static void main(String[] args) {
        int []nums=new int[]{1,0,2,-1,1,0};
        List<List<Integer>> les = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int low = i + 1, high = nums.length - 1, sum = 0 - nums[i];
            if (nums[low] + nums[high] == sum) {
                les.add(Arrays.asList(nums[i], nums[low], nums[high]));
                while ((low < high && nums[low] == nums[low + 1])) low++;
                while ((low < high && nums[high] == nums[low - 1])) high--;
                low++;
                high--;
            } else if (nums[low] + nums[high] < sum) {
                low++;
            } else high--;
        }
        System.out.println(les);
    }
}

