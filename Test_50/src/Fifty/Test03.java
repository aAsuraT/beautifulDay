
package Fifty;

/**
 * 
 * @author 作者 Your-Name: 城东娜院
 * 
 * @version 创建时间：2019年3月1日 上午11:22:41
 * 	题目：打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。
 * 	例如：153是一个 "水仙花数 "，因为153=1的三次方＋5的三次方＋3的三次方。
 */

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for
		int count = 0; // 定义水仙花数的个数
		for (int i = 100; i < 1000; i++) { // 水仙花数范围
			int b = i / 10 / 10 % 10; // 取得百位数
			int s = i / 10 % 10; // 取得十位数
			int g = i % 10; // 取得个位数

			if (i == g * g * g + s * s * s + b * b * b) { // 水仙花数判定
				System.out.print(i + " "); // 输出符合条件的数
				count++;
			}
		}
		System.out.println(); // 换行
		System.out.println("水仙花数总共有" + count + "个"); // 输出水仙花数的总数
		
		// while
		int i1 = 100;
		int count1 = 0; // 定义水仙花数的个数
		while (i1 < 1000) {
			int b1 = i1 / 10 / 10 % 10; // 取得百位数
			int s1 = i1 / 10 % 10; // 取得十位数
			int g1 = i1 % 10; // 取得个位数

			if (i1 == g1 * g1 * g1 + s1 * s1 * s1 + b1 * b1 * b1) { // 水仙花数判定
				System.out.print(i1 + " "); // 输出符合条件的数
				count1++;
			}
			i1 += 1;
		}
		System.out.println();
		System.out.println("水仙花数总共有" + count1 + "个"); // 输出水仙花数的总数

		// do-while
		int i2 = 100;
		int count2 = 0; // 定义水仙花数的个数
		do {
			i2 += 1;
			int b2 = i2 / 10 / 10 % 10; // 取得百位数
			int s2 = i2 / 10 % 10; // 取得十位数
			int g2 = i2 % 10; // 取得个位数

			if (i2 == g2 * g2 * g2 + s2 * s2 * s2 + b2 * b2 * b2) { // 水仙花数判定
				System.out.print(i2 + " "); // 输出符合条件的数
				count2++;
			}
		} while (i2 < 1000);
		System.out.println();
		System.out.println("水仙花数总共有" + count2 + "个"); // 输出水仙花数的总数
	}

}
