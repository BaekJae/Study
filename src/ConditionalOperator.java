
public class ConditionalOperator {
	public static void main(String[] args) {
		int a=14, b=21, c=43, d=59;
		int max;
		max=(a>b)? a: b;
		max=(max>c)? max:c;
		max=(max>d)? max:d;
		System.out.println("Max : " +max);
	}
}
