import java.io.*;
public class Exception4 {
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			try {
				System.out.print("첫 번째 값을 입력하세요 => ");
				int num1 = Integer.parseInt(in.readLine());
				System.out.print("두 번째 값을 입력하세요 => ");
				int num2 = Integer.parseInt(in.readLine());
				System.out.println(num1+"/"+num2+"="+num1/num2);
			}
			catch(NumberFormatException e) {
				System.out.println("입력한 문자를 숫자 형식으로 변경할 수 없습니다.");
			}
			catch(ArithmeticException e) {
				System.out.println("0으로 나누는 계산은 처리할 수 없습니다.");
			}
		}
		
	}

}
