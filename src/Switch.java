
public class Switch {
	public static void main(String[] args) throws Exception{
		int a;
		System.out.print("1부터 9사이의 숫자를 입력하세요. : ");
		a=System.in.read()-'0';
		switch(a) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 9:
			System.out.println(a+ "는(은) 홀수입니다.");
			break;
			
		case 2:
		case 4:
		case 6:
		case 8:
			System.out.println(a+ "는(은) 짝수입니다.");
			break;
		default:
				System.out.println(a+ "는(은) 홀수도 짝수도 아닙니다.");
		}
	}

}
