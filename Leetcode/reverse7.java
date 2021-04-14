/**7. 整数反转
        给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
        示例 1:
        输入: 123
        输出: 321

        示例 2:
        输入: -123
        输出: -321

        示例 3:
        输入: 120
        输出: 21
        注意:
        假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。
        请根据这个假设，如果反转后整数溢出那么就返回 0。*/

package Leetcode;

public class reverse7 {
    public int reverse(int x) {
        long res=0;
        while (x!=0) {
            res = res * 10 + x % 10;
            x /= 10;
            if (res>Integer.MAX_VALUE||res<Integer.MIN_VALUE)return 0;
        }
return (int)res;
    }

    public static void main(String[] args) {
        int x=1999999999;
        long res=0;
        while (x!=0) {
            res = res * 10 + x % 10;
            x /= 10;
            if (res>Integer.MAX_VALUE||res<Integer.MIN_VALUE)return ;
        }
        System.out.println(res);


        /*int x=132;
        x=100*(x%10)+10*((x/10)%10)+(x/100);
        System.out.println(x);*/
    }

}
