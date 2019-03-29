
package Fifty;

import java.util.Scanner;

/**
 * 
 * @author 作者 Your-Name: 城东娜院
 * 
 * @version 创建时间：2019年3月4日 下午8:05:32
 * 	题目：利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。   
 */

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input your score:");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		if (x < 60) {
			System.out.println("等级为：" + "C");
		}
		if (x >= 60 && x <= 89) {
			System.out.println("等级为：" + "B");
		} else if (x >= 90) {
			System.out.println("等级为：" + "A");
		}
	}

}
