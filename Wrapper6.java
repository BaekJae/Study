public class Wrapper6 {
	public static void main(String[] args) {
		Integer one = new Integer("15");
		Integer two = new Integer(21);
		int total = one.intValue() + two.intValue();
		System.out.println("one : "+one.intValue()+", two : "+two.intValue());
		System.out.println("one + two = "+total);
		System.out.println(total+" >> 2진수 : "+Integer.toBinaryString(total));
		System.out.println(total+" >> 8진수 : "+Integer.toOctalString(total));
		System.out.println(total+" >> 16진수 : "+Integer.toHexString(total));
	}
}
