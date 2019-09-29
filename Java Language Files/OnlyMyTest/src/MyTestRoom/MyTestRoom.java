/**
 * @author 이진혁
 * @filename 
 * @contents {
 * 		C언어에서는 a^=b^=a^=b 를 실행하면 a의 값, b의 값이 서로 바뀌는데
 * 		Java에서는 a^=b^=a^=b 를 실행하면 b의 값만 바뀌고 a의 값이 0으로 바뀐다.
 * 		이곳에서는 왜 그러한지 알아보았다.
 * }
 */

package MyTestRoom;

public class MyTestRoom {
	public static void main(String[] args) {
		int a = 10, b = 20;			// 값을 변경할 a와 b를 초기화 한다.
		
		a^=b^=a^=b;
		
		System.out.println("a = " + a + "\nb = " + b);
	}
}