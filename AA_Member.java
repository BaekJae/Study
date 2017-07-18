class AA{
	int aa=20;
	class BB{
		final static double PI = 3.1415;
		int bb=aa+10;
	}
}
public class AA_Member {
	public static void main(String[] args) {
		AA a = new AA();
		AA.BB b;
		b=a.new BB();
		System.out.println("PI 값은 "+AA.BB.PI);
		System.out.println("BB 클래스 내부변수 bb = "+b.bb);
	}

}
