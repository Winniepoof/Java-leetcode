package ��ҵ2;
import java.util.Scanner;
public class ��ҵ3 {
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
       
        System.out.print("������һ��byte������: ");
        bt=in.nextByte();
        System.out.println("�������byte������Ϊ: " + bt);
        
        System.out.print("������һ��short������: ");
        st=in.nextByte();
        System.out.println("�������short������Ϊ: " + st);
        
        System.out.print("������һ��int������: ");
        i=in.nextInt();
        System.out.println("�������int������Ϊ: " + i);
        
        System.out.print("������һ��long������: ");
        l=in.nextLong();
        System.out.println("�������long������Ϊ: " + l);

        System.out.print("������һ��float�͸�����: ");
        ft=in.nextFloat();
        System.out.println("�������float�͸�����Ϊ: " + ft);
        
        System.out.print("������һ��double�͸�����: ");
        dbl=in.nextDouble();
        System.out.println("�������double�͸�����Ϊ: " + dbl);
        
        System.out.print("������һ��boolean�ͱ���: ");
        bn=in.nextBoolean();
        System.out.println("�������boolean�ͱ���Ϊ: " + bn);

        System.out.print("������һ��char�ͱ���: ");
        ch=in.next().charAt(0);
        System.out.println("�������char�ͱ���Ϊ: " + ch);

        System.out.print("������һ���ַ���: ");
        str=in.next();
        System.out.println("��������ַ���Ϊ: " + str);
    }

}
