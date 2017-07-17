
public class Test2_3 {
	public static void main(String[] args) {
		int a;
		for(a=1;a<=1000;a++) {
			if(a%5==0) {
				if(a%7==0) {
					System.out.print(" "+a);
				}
			}
		}
	}
}
