package 作业2;
import java.util.Scanner;
public class 作业2 {
	public static void main(String[]args)
	{
		int [][] array= {{2,0,1,7},{3,0,9,0},{1,0,1,4}};
		for (int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out .print(array[i][j]);
			}
			System.out .print(0);
		}
	}
}
