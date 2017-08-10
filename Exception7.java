public class Exception7{
	public static void Exception1() {
		try {
			throw new NumberFormatException("숫자 변환 예외 발생");
		}
		catch (NumberFormatException e) {
			System.out.println("인위로 발생된 예외 >> "+e.getMessage());
			throw new ArithmeticException("catch 블록에서 발생시킨 예외");
		}
	}
	public static void main(String[] args) {
		try {
			System.out.println("====> 예외 발생전 <====");
			Exception1();
		}
		catch(ArithmeticException e) {
			System.out.println("중복된 예외 처리 블록 >> "+e.getMessage());
		}
	}
}
