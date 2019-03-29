
package Fifty;

import java.time.chrono.MinguoChronology;
import java.util.Scanner;

/**
 * 
 * @author 作者 Your-Name: 城东娜院
 * 
 * @version 创建时间：2019年3月4日 下午8:31:08
 * 
 *          题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
 *          
 *          在循环中，只要除数不等于0，用较大数除以较小的数，将小的一个数作为下一轮循环的大数，
 *          取得的余数作为下一轮循环的较小的数，如此循环直到较小的数的值为0，返回较大的数，
 *          此数即为最大公约数，最小公倍数为两数之积除以最大公约数。
 * 
 * 
 */

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner r = new Scanner(System.in);
		System.out.println("Please input the num M :");
		int m = r.nextInt();
		System.out.println("Please input the num N :");
		int n = r.nextInt();
		int imax = Gongyue(m, n);
		int ibei = m * n / imax;
		System.out.println("最大公约数: " + imax);
		System.out.println("最小公倍数: " + ibei);

	}

	static int Gongyue(int x, int y) {
		//求两数中的最大和最小值
		int max = x > y ? x : y;
		int min = x < y ? x : y;
		while (min != 0) {
			if (max == min) {
				return min;
			} else {
				int k = max % min;//先把大数除以小数的数存好
				max = min;//再将小数作为大数进行运算
				min = k;//最后把之前的-->大数除以小数的数拿来作为小数进行运算
			}
		}
		return max;
	}

}
