
public class If {
	public static void main(String[] args) throws Exception{
		int ch;
		System.out.print("���ڸ� �Է��ϼ���. : ");
		ch=System.in.read();
		if(ch>='A' && ch<='Z') {
			System.out.println((char) ch+("�� �빮���Դϴ�."));
		}
		else if(ch>='a' && ch <='z') {
			System.out.println((char) ch+("�� �ҹ����Դϴ�."));
		
		}
		else {
			System.out.println("���ĺ��� �ƴմϴ�.");
		}
	}
}
