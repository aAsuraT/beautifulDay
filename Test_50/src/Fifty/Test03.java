
package Fifty;

/**
 * 
 * @author ���� Your-Name: �Ƕ���Ժ
 * 
 * @version ����ʱ�䣺2019��3��1�� ����11:22:41
 * 	��Ŀ����ӡ�����е� "ˮ�ɻ��� "����ν "ˮ�ɻ��� "��ָһ����λ�������λ���������͵��ڸ�������
 * 	���磺153��һ�� "ˮ�ɻ��� "����Ϊ153=1�����η���5�����η���3�����η���
 */

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for
		int count = 0; // ����ˮ�ɻ����ĸ���
		for (int i = 100; i < 1000; i++) { // ˮ�ɻ�����Χ
			int b = i / 10 / 10 % 10; // ȡ�ð�λ��
			int s = i / 10 % 10; // ȡ��ʮλ��
			int g = i % 10; // ȡ�ø�λ��

			if (i == g * g * g + s * s * s + b * b * b) { // ˮ�ɻ����ж�
				System.out.print(i + " "); // ���������������
				count++;
			}
		}
		System.out.println(); // ����
		System.out.println("ˮ�ɻ����ܹ���" + count + "��"); // ���ˮ�ɻ���������
		
		// while
		int i1 = 100;
		int count1 = 0; // ����ˮ�ɻ����ĸ���
		while (i1 < 1000) {
			int b1 = i1 / 10 / 10 % 10; // ȡ�ð�λ��
			int s1 = i1 / 10 % 10; // ȡ��ʮλ��
			int g1 = i1 % 10; // ȡ�ø�λ��

			if (i1 == g1 * g1 * g1 + s1 * s1 * s1 + b1 * b1 * b1) { // ˮ�ɻ����ж�
				System.out.print(i1 + " "); // ���������������
				count1++;
			}
			i1 += 1;
		}
		System.out.println();
		System.out.println("ˮ�ɻ����ܹ���" + count1 + "��"); // ���ˮ�ɻ���������

		// do-while
		int i2 = 100;
		int count2 = 0; // ����ˮ�ɻ����ĸ���
		do {
			i2 += 1;
			int b2 = i2 / 10 / 10 % 10; // ȡ�ð�λ��
			int s2 = i2 / 10 % 10; // ȡ��ʮλ��
			int g2 = i2 % 10; // ȡ�ø�λ��

			if (i2 == g2 * g2 * g2 + s2 * s2 * s2 + b2 * b2 * b2) { // ˮ�ɻ����ж�
				System.out.print(i2 + " "); // ���������������
				count2++;
			}
		} while (i2 < 1000);
		System.out.println();
		System.out.println("ˮ�ɻ����ܹ���" + count2 + "��"); // ���ˮ�ɻ���������
	}

}
