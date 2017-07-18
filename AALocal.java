class AA{
	public void showAA(final int aa) {
		class BB{
			int bb=aa+10;
			public void showBB() {
				System.out.println("aa = "+aa+" bb = "+bb);
			}
		}
		BB b= new BB();
		b.showBB();
	}
}
public class AALocal {
	public static void main(String[] args) {
		AA a = new AA();
		a.showAA(20);
	}
}
