/**33. 搜索旋转排序数组
        假设按照升序排序的数组在预先未知的某个点上进行了旋转。

        ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。

        搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。

        你可以假设数组中不存在重复的元素。

        你的算法时间复杂度必须是 O(log n) 级别。

        示例 1:

        输入: nums = [4,5,6,7,0,1,2], target = 0
        输出: 4
        示例 2:

        输入: nums = [4,5,6,7,0,1,2], target = 3
        输出: -1*/
package Leetcode;
import java.util.Arrays;
import java.lang.reflect.Array;

public class search33 {
    public int search(int[] nums, int target) {
        if (nums==null||nums.length==0) return 0;
        int i=0;
        int []b=new int []{-1};
        if (nums.length==0||nums==null)return 0;
        for ( i=0;i<nums.length;i++){
            if (nums[i]==target){
                b[0]=i;
                break;
            }
        }
        return b[0];
    }

    public static void main(String[] args) {
        int []a=new int[]{4,5,6,7,0,1,2};
        int c=3;
        int i=0;
        int []b=new int []{-1};
        if (a.length==0||a==null)return ;
        for ( i=0;i<a.length;i++){
            if (a[i]==c){
                b[0]=i;
                break;
            }
            /*else System.out.println(-1);*/
        }
        System.out.println(Arrays.toString(b));
    }

}
