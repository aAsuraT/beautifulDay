
package Fifty;

/**
 * 
 * @author 作者 Your-Name: 城东娜院
 * 
 * @version 创建时间：2019年3月4日 下午7:16:14 
 * 	题目：判断101-200之间有多少个素数，并输出所有素数。
 * 
 * 	程序分析：判断素数的方法：用一个数分别去除2到sqrt(这个数)，如果能被整除， 则表明此数不是素数，反之是素数。

 */

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int k = 5;
		for (int i = 101; i <= 200; i++) {
			boolean b = false;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					b = false;// 此处说明不是素数
					break;
				} else {
					b = true;
				}
			}
			if (b == true) {
				count++;
				k++;
				System.out.format("%4d", i);
				if (k % 5 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println("素数个数是: " + count);
	}
}
