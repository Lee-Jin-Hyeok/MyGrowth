/**
 * @author ������
 * @filename 
 * @contents {
 * 		C������ a^=b^=a^=b �� �����ϸ� a�� ��, b�� ���� ���� �ٲ�µ�
 * 		Java������ a^=b^=a^=b �� �����ϸ� b�� ���� �ٲ�� a�� ���� 0���� �ٲ��.
 * 		�̰������� �� �׷����� �˾ƺ��Ҵ�.
 * }
 */

package MyTestRoom;

public class aXORb {
	public static void main(String[] args) {
		int a = 10, b = 20;			// ���� ������ a�� b�� �ʱ�ȭ �Ѵ�.
		
		System.out.println("a = " + a + "\n" + "b = " + b + "\n");		// �������� �ʱ�ȭ�� �Ǿ����� �� �� ������...
		a^=b^=a^=b;
		System.out.println("a = " + a + "\n" + "b = " + b + "\n");		// ������ a�� b�� �ٲ��� �ʾҴٴ� ���� �� �� �ִ�.
	}
}