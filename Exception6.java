public class Exception6 {
	public static void main(String[] args) {
		try {
			System.out.println("=====> 예외 발생 전 <=====");
			throw new NumberFormatException("숫자 변환 예외 발생");
		}
		catch(NumberFormatException e) {
			System.out.println("인위로 발생된 예외 >> "+e.getMessage());
		}
	}
}
