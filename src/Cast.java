
public class Cast {
	public static void main(String[] args) {
		byte a;
		int b=365;
		double c= 1024.512;
		
		System.out.println("��� ����ȯ ���");
		a=(byte)b;
		System.out.println("int �� 365�� byte������ �ٲٸ� : " +a );
		
		b=(int)c;
		System.out.println("double �� 1024.512�� int������ �ٲٸ� : " +b);
		
		a=(byte)c;
		System.out.println("double �� 1024.512�� byte������ �ٲٸ� : " +a);
	}

}
