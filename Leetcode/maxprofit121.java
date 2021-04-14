//121. 买卖股票的最佳时机
//给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
//如果你最多只允许完成一笔交易（即买入和卖出一支股票），设计一个算法来计算你所能获取的最大利润。
//注意你不能在买入股票前卖出股票。
//示例 1:
//输入: [7,1,5,3,6,4]
//输出: 5
//解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
//  注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
//示例 2:
//输入: [7,6,4,3,1]
//输出: 0
//解释: 在这种情况下, 没有交易完成, 所以最大利润为 0。
package Leetcode;
import java.util.ArrayList;
import java.util.Collections;

public class maxprofit121 {
    public static int maxProfit(int[] prices) {

        ArrayList<Integer> re = new ArrayList<Integer>();
        for (int j = prices.length; j >= 1; j--) {
            for (int i = 0; i < j; i++) {
                if (prices[j] - prices[i] != 0) {
                    re.add(prices[j] - prices[i]);
                } else {
                    re.add(0);
                }
            }
        }
        if (prices==null||prices.length==0) return prices[0];
        Collections.sort(re, Collections.reverseOrder());
        System.out.println(re.get(0));
return re.get(0);

        /*int max=0;
       for (int i=0;i<prices.length-3;i++){
           int high=prices.length-1,low=i+1;
           if (prices[high]-prices[i]>prices[high]-prices[low]){

           }
           max=prices[high]-prices[i];
           i++;
       }return  max;*/
    }


    public static void main(String[] args) {
        {
            int [] prices=new int[]{};
            if (prices==null||prices.length==0) return;
            ArrayList<Integer> re = new ArrayList<Integer>();
            for (int j = prices.length-1; j >= 1; j--) {
                for (int i = 0; i < j; i++) {

                    if (prices[j] - prices[i] > 0) {
                        re.add(prices[j] - prices[i]);
                    } else {
                        re.add(0);
                    }
                }
            }
            Collections.sort(re, Collections.reverseOrder());
            System.out.println(re.get(0));

        }
    }
}

    /*ArrayList<Integer> re = new ArrayList<Integer>(100);
    int []b=new  int[2];
    int i;
    int a;
        for (i = 0; i < prices.length; i++) {
        int j = i + 1;
        re.add(prices[j] - prices[i]);
        j++;
        }
        Collections.sort(re);
        String[] ar = re.toArray(new String[re.size()]);
        String m=ar[0];
        return 0;*/

//list升序，降序，逆序
//List<Integer>list =new ArrayList<Integer>();
////如果list是 5 7 2 6 8 1 4
//1、升序：
//Collections.sort(list) //list： 1 2 4 5 6 7 8
//2、降序：
//Collections.sort(list，Collections.reverseOrder())//list:8 7 6 5 4 2 1
//3、逆序；
//Collections.reverse(list)//list：4 1 8 6 2 7 5
//数组升序，降序
//int[] a={5 7 2 6 8 1 4}
//1、升序：
//Arrays.sort(a)//a： 1 2 4 5 6 7 8
//2、降序：
//Arrays.sort(a，Collections.reverseOrder())//a： 8 7 6 5 4 2 1
//Arrays.asList(数组)//将数组转成list
//Arrays.asList(a)；
//List<Integer>list =new ArrayList<Integer>(Arrays.asList(a));





