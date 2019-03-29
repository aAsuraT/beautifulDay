
package Fifty;

import java.util.Scanner;

/**
 * 
 * @author 作者 Your-Name: 城东娜院
 * 
 * @version 创建时间：2019年3月5日 下午7:30:57
 * 
 */

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input content :");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		//新建扫描，用来接收输入的字符
		System.out.println(s);
		/********************************************/
		int digital = 0;// 数字个数
		int character = 0;// 英文字母个数
		int other = 0;// 其他字符个数
		int blank = 0;// 空格个数
		/********************************************/
		char[] ch = s.toCharArray();
		/*
		 * 	为了一个个判断是哪种类型的字符，所以把接收到
		 * 	的字符串存放到char[] ch中
		 */
		
		/********************************************/
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= '0' && (int) c <= '9') {
				digital++;
			} else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
				character++;
			} else if (c == ' ') {
				blank++;
			} else {
				other++;
			}
		}
		/********************************************/
		System.out.println("数字个数: " + digital);
		System.out.println("英文字母个数: " + character);
		System.out.println("空格个数: " + blank);
		System.out.println("其他字符个数:" + other);
	}

}
