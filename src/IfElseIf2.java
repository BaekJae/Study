
public class IfElseIf2 {
	public static void main(String[] args) throws Exception {
		int ch;
		System.out.print("���ڸ� �Է��ϼ��� : ");
		ch=System.in.read();
		if(ch=='a' || ch=='A') {
			System.out.println("America");
			System.out.println("Australia");
		}
		else if(ch == 'K' || ch == 'k') {
			System.out.println("Korea");
			System.out.println("Kuwait");
		}
		else if (ch=='m' || ch == 'M') {
			System.out.println("Mexico");
			System.out.println("Monaco");
		}
		
	}

}
