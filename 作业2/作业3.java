package 作业2;
import java.util.Scanner;
public class 作业3 {
	public static void main(String[]args) throws Exception{
        byte bt;
        short st;
        int i;
        long l;
        float ft;
        double dbl;       
        boolean bn;        
        char ch;        
        String str;
        
        Scanner in=new Scanner(System.in);  
       
        System.out.print("请输入一个byte型整数: ");
        bt=in.nextByte();
        System.out.println("您输入的byte型整数为: " + bt);
        
        System.out.print("请输入一个short型整数: ");
        st=in.nextByte();
        System.out.println("您输入的short型整数为: " + st);
        
        System.out.print("请输入一个int型整数: ");
        i=in.nextInt();
        System.out.println("您输入的int型整数为: " + i);
        
        System.out.print("请输入一个long型整数: ");
        l=in.nextLong();
        System.out.println("您输入的long型整数为: " + l);

        System.out.print("请输入一个float型浮点数: ");
        ft=in.nextFloat();
        System.out.println("您输入的float型浮点数为: " + ft);
        
        System.out.print("请输入一个double型浮点数: ");
        dbl=in.nextDouble();
        System.out.println("您输入的double型浮点数为: " + dbl);
        
        System.out.print("请输入一个boolean型变量: ");
        bn=in.nextBoolean();
        System.out.println("您输入的boolean型变量为: " + bn);

        System.out.print("请输入一个char型变量: ");
        ch=in.next().charAt(0);
        System.out.println("您输入的char型变量为: " + ch);

        System.out.print("请输入一个字符串: ");
        str=in.next();
        System.out.println("您输入的字符串为: " + str);
    }

}
