import java.text.*;
import java.io.*;
public class MessageFormatTest {
	public static void main(String[] args) throws IOException {
		String message ="{0}님의 성적은 국어:{1}점, 영어:{2}점입니다.";
		MessageFormat mf = new MessageFormat(message);
		Object []input = new Object[3];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름 입력 ==> ");
		input[0] = (String) br.readLine();
		System.out.print("국어 점수 ==> ");
		input[1]= br.readLine();
		System.out.print("영어 점수 ==> ");
		input[2]= br.readLine();
		System.out.println(mf.format(input));
	}
}
