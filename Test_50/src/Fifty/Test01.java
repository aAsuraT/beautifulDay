package Fifty;

import java.util.Scanner;

/**
 * 
 * @author 作者 Your-Name: 城东娜院
 * 
 * @version 创建时间：2019年3月4日 下午3:16:53
 * 	题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 	小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？   
 ***************** 	这是一个菲波拉契数列问题 	*****************

 * 1.程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21.... 
         这是一个菲波拉契数列问题
         {斐波拉契数列原理：除开前两项 后面每位数等于前两项相加之和}
         1.通过中间值来保存上一月兔子的和
         2.在将上一月兔子这一月兔子相加 得到下一月数量和
*/

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f1=1,f2=1,f,M=24;
		System.out.println("第1个月的兔子对数:"+1);
		System.out.println("第2个月的兔子对数:"+1);
		for (int i = 3; i <= M; i++) {//循环是月份
			f = f2;
			f2 = f1 + f2;
			f1 = f;
			System.out.println("第"+i+"个月的兔子对数:"+f2);
		}
	}

}
