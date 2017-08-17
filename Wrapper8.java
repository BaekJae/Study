public class Wrapper8 {
	public static void main(String[] args) {
		Float test = new Float("15.0f");
		System.out.println("현재 값:"+test);
		System.out.println("byte 값:"+test.byteValue());
		System.out.println("short 값:"+test.shortValue());
		System.out.println("int 값:"+test.intValue());
		System.out.println("long 값:"+test.longValue());
		System.out.println("double 값:"+test.doubleValue());
		System.out.println("NaN 체크:"+test.isNaN());
		System.out.println("무힌대 체크 :"+test.isInfinite());
	}
}
