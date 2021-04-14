/**409. 最长回文串
        给定一个包含大写字母和小写字母的字符串，找到通过这些字母构造成的最长的回文串。
        在构造过程中，请注意区分大小写。比如 "Aa" 不能当做一个回文字符串。
        注意:
        假设字符串的长度不会超过 1010。

        示例 1:

        输入:
        "abccccdd"

        输出:
        7

        解释:
        我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。*/

package Leetcode;

import java.util.Stack;

public class longestPalindrome409 {
    public int longestPalindrome(String s) {
        char[] st = s.toCharArray();
        if (s==null||s.length()==0) return 0;
        else if(s.length()==1) return 1;
        else if(s.length()==2||st[0]==st[1]) return 2;
        else if(s.length()==2||st[0]!=st[1]) return 1;
        int cont = 0;
        for (int i = 0; i < st.length - 1; i++) {
            int j = i + 1;
            if (st[i] == st[j]) cont++;
        }
        cont= 2*cont-1;
        if (cont<0){return 0;}
        else {return cont;}

    }

    public static void main(String[] args) {
        String s=new String("ab");
        Stack<Character> sk = new Stack<Character>();
        char[] st = s.toCharArray();
        if (s==null||s.length()==0) System.out.println(0);
        else if(st.length==1) System.out.println(1);
        else if (st.length==2||st[0]==st[1]) System.out.println(2);
        else if (st.length==2||st[0]!=st[1]) System.out.println(1);
        int cont = 0;
        for (int i = 0; i < st.length - 1; i++) {
            int j = i + 1;
            if (st[i] == st[j]) cont++;
        }
        cont= 2*cont-1;
        if (cont<0){System.out.println(0);}
      else {System.out.println(cont);}
    }
}
