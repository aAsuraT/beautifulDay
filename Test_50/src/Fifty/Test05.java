
package Fifty;

import java.util.Scanner;

/**
 * 
 * @author ���� Your-Name: �Ƕ���Ժ
 * 
 * @version ����ʱ�䣺2019��3��4�� ����8:05:32
 * 	��Ŀ�����������������Ƕ������ɴ��⣺ѧϰ�ɼ�> =90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ��   
 */

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input your score:");
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		if (x < 60) {
			System.out.println("�ȼ�Ϊ��" + "C");
		}
		if (x >= 60 && x <= 89) {
			System.out.println("�ȼ�Ϊ��" + "B");
		} else if (x >= 90) {
			System.out.println("�ȼ�Ϊ��" + "A");
		}
	}

}
