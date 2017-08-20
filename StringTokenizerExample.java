import java.util.*;
public class StringTokenizerExample {
	public static void main(String[] args) {
		String str = "자바는 다양한 문자열 처리,날짜 처리,"+"시간 처리를 위한 메소드를 갖고 있습니다.";
		StringTokenizer st = new StringTokenizer(str,",");
		System.out.println("토큰 ','의 개수 " + st.countTokens()+"개");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
