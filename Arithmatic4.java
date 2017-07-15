public class Arithmatic4{
	public static void main(String[] args){
		int sum = 15, sub = 20, mul = 6, div = 56;

		System.out.println("계산 전 수");
		System.out.println("sum : " +sum);
		System.out.println("sub : " +sub);
		System.out.println("mul : " +mul);
		System.out.println("div : " +div);

		sum += 10;
		sub -= 6;
		mul *= 4;
		div /= 7;

		System.out.println("계산 후 결과");
		System.out.println("sum : " +sum);
		System.out.println("sub : " +sub);
		System.out.println("mul : " +mul);
		System.out.println("div : " +div);
	}
}