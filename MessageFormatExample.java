import java.text.*;
public class MessageFormatExample {
	public static void main(String[] args) {
		String str = "{0}에는 {2}이 불고 {3}은 모여 {1}로 흘러갑니다.";
		MessageFormat mf = new MessageFormat(str);
		Object input[]= {"하늘","바다","바람","강물"};
		System.out.println(mf.format(input));
	}
}
