
public class Wrapper7 {
	public static void main(String[] args) {
		Long one = new Long("15");
		long two = Long.parseLong("100");
		long total = one.longValue()+two;
		System.out.println("one : "+one.longValue()+", two : "+two);
		System.out.println("one + two = "+total);
		System.out.println(total+" >> 2진수 : "+Long.toBinaryString(total));
		System.out.println(total+" >> 8진수 : "+Long.toOctalString(total));
		System.out.println(total+" >> 16진수 : "+Long.toHexString(total));
	}
}
