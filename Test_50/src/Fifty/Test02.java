
package Fifty;

/**
 * 
 * @author ���� Your-Name: �Ƕ���Ժ
 * 
 * @version ����ʱ�䣺2019��3��4�� ����7:16:14 
 * 	��Ŀ���ж�101-200֮���ж��ٸ����������������������
 * 
 * 	����������ж������ķ�������һ�����ֱ�ȥ��2��sqrt(�����)������ܱ������� ���������������������֮��������

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
					b = false;// �˴�˵����������
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
		System.out.println("����������: " + count);
	}
}
