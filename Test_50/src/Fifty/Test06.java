
package Fifty;

import java.time.chrono.MinguoChronology;
import java.util.Scanner;

/**
 * 
 * @author ���� Your-Name: �Ƕ���Ժ
 * 
 * @version ����ʱ�䣺2019��3��4�� ����8:31:08
 * 
 *          ��Ŀ����������������m��n���������Լ������С��������
 *          
 *          ��ѭ���У�ֻҪ����������0���ýϴ������Խ�С��������С��һ������Ϊ��һ��ѭ���Ĵ�����
 *          ȡ�õ�������Ϊ��һ��ѭ���Ľ�С���������ѭ��ֱ����С������ֵΪ0�����ؽϴ������
 *          ������Ϊ���Լ������С������Ϊ����֮���������Լ����
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
		System.out.println("���Լ��: " + imax);
		System.out.println("��С������: " + ibei);

	}

	static int Gongyue(int x, int y) {
		//�������е�������Сֵ
		int max = x > y ? x : y;
		int min = x < y ? x : y;
		while (min != 0) {
			if (max == min) {
				return min;
			} else {
				int k = max % min;//�ȰѴ�������С���������
				max = min;//�ٽ�С����Ϊ������������
				min = k;//����֮ǰ��-->��������С������������ΪС����������
			}
		}
		return max;
	}

}
