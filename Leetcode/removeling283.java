//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
//示例:
//输入: [0,1,0,3,12]
//输出: [1,3,12,0,0]
package Leetcode;

public class removeling283 {
    public void moveZeroes(int[] nums) {
        if (nums==null||nums.length==0) return;
        int i;
        int m=0;
        for ( i=0;i<nums.length;i++){
            if (nums[i]!=0){
                nums[m++]=nums[i];
            }
        }
        while (m <nums.length){
            nums[m++]=0;
        }
    }
}
// public void moveZeroes(int[] nums) {
//        int i;
//        int j=nums.length-1;
//        int m=0;
//        for ( i=0;i<nums.length;i++){
//            if (nums[i]!=0){
//                nums[m]=nums[i];
//                m++;
//            }else{
//                nums[j]=0;
//                j--;
//            }
//        }
//    }



