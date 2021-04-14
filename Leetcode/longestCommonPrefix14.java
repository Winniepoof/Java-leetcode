/**14. 最长公共前缀
编写一个函数来查找字符串数组中的最长公共前缀。
        如果不存在公共前缀，返回空字符串 ""。
        示例 1:
        输入: ["flower","flow","flight"]
        输出: "fl"
        示例 2:
        输入: ["dog","racecar","car"]
        输出: ""
        解释: 输入不存在公共前缀。*/
package Leetcode;

public class longestCommonPrefix14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs==null||strs.length==0) return "";
        String ab=strs[0];
        for (int i=1;i<strs.length-1;i++){
            while (strs[i].indexOf(ab)!=0)
                ab=ab.substring(0,ab.length()-1);
        }
        return ab;
    }


    public static void main(String[] args) {
        String[] strs=new  String[]{"dogest","doge","dog"};//["flower","flow","flight"]
        if (strs==null||strs.length==0) return ;
        String ab=strs[0];
        for (int i=1;i<strs.length-1;i++){
            while (strs[i].indexOf(ab)!=0)
                ab=ab.substring(0,ab.length()-1);
        }
        System.out.println(ab);

    }
}