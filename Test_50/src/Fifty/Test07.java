
package Fifty;

import java.util.Scanner;

/**
 * 
 * @author ���� Your-Name: �Ƕ���Ժ
 * 
 * @version ����ʱ�䣺2019��3��5�� ����7:30:57
 * 
 */

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input content :");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		//�½�ɨ�裬��������������ַ�
		System.out.println(s);
		/********************************************/
		int digital = 0;// ���ָ���
		int character = 0;// Ӣ����ĸ����
		int other = 0;// �����ַ�����
		int blank = 0;// �ո����
		/********************************************/
		char[] ch = s.toCharArray();
		/*
		 * 	Ϊ��һ�����ж����������͵��ַ������԰ѽ��յ�
		 * 	���ַ�����ŵ�char[] ch��
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
		System.out.println("���ָ���: " + digital);
		System.out.println("Ӣ����ĸ����: " + character);
		System.out.println("�ո����: " + blank);
		System.out.println("�����ַ�����:" + other);
	}

}
