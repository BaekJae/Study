
public class Second10 {
	public static void main(String[] args) throws Exception {
		int num, cnt;
		System.out.println("구구단을 출력할 숫자를 입력하세요. : ");
		num= System.in.read()-'0';
		for(cnt=1; cnt<=9; cnt++) {
			System.out.println(num+" * " +cnt+ " = "+(num*cnt));
		}
	}

}
