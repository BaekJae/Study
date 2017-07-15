
public class IfElse {
	public static void main(String[] args) throws Exception {
		int ch;
		System.out.print("문자를 입력하세요. : ");
		ch=System.in.read();
		if(ch>='a' && ch<='z') {
			System.out.println("입력한 문자는 소문자입니다.");
		}
		else if(ch>='A' && ch<='Z') {
			System.out.println("입력한 문자는 대문자입니다.");
		}
		else
			System.out.println("입력한 문자는 알파벳이 아닙니다.");
	}

}
