
public class IfElse {
	public static void main(String[] args) throws Exception {
		int ch;
		System.out.print("���ڸ� �Է��ϼ���. : ");
		ch=System.in.read();
		if(ch>='a' && ch<='z') {
			System.out.println("�Է��� ���ڴ� �ҹ����Դϴ�.");
		}
		else if(ch>='A' && ch<='Z') {
			System.out.println("�Է��� ���ڴ� �빮���Դϴ�.");
		}
		else
			System.out.println("�Է��� ���ڴ� ���ĺ��� �ƴմϴ�.");
	}

}
