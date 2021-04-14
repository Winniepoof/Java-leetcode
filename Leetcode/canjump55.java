/**55. 跳跃游戏
        给定一个非负整数数组，你最初位于数组的第一个位置。

        数组中的每个元素代表你在该位置可以跳跃的最大长度。

        判断你是否能够到达最后一个位置。

        示例 1:

        输入: [2,3,1,1,4]
        输出: true
        解释: 我们可以先跳 1 步，从位置 0 到达 位置 1, 然后再从位置 1 跳 3 步到达最后一个位置。
        示例 2:

        输入: [3,2,1,0,4]
        输出: false
        解释: 无论怎样，你总会到达索引为 3 的位置。但该位置的最大跳跃长度是 0 ， 所以你永远不可能到达最后一个位置。*/

package Leetcode;

public class canjump55 {
    public boolean canJump(int[] nums) {
        int max=0;
        if (nums==null||nums.length==0) return false;
        for (int i=0;i<nums.length-1;i++){
            max=Math.max(max,i+nums[i]);
        }
        if (max>=nums.length-1)return  true;
        else return false;
    }

    public static void main(String[] args) {
        int []a=new int []{0,2,3};
        int max=0;

        if (a==null||a.length==0) return ;
        for (int i=0;i<a.length-1;i++){
            max=Math.max(max,i+a[i]);
        }
        /*while (i<a.length) {
            max = Math.max(max, i + a[i]);
            i++;
        }*/
        System.out.println(max);
        System.out.println(a.length);
        if (max>=a.length-1)System.out.println(true);
        else System.out.println(false);
    }
    public static int max(int[] nums,int m,int n){
        int max=nums[m];
        while (m<=n) {
            if (max <= nums[m]) {
                max = nums[m];
                m++;
            }
            else m++;
        }
        return max;
    }

}
