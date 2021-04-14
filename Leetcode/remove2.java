package Leetcode;

public class remove2 {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2)
            return nums.length;
        int i = 1;
        int j = 0;
        while (nums.length > i) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
            i++;
        }
        return j + 1;
    }
}
