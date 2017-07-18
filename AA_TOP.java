class AA{
	static class BB{
		static int bb=20;
		static class CC{
			int cc = bb+10;
		}
	}
}
public class AA_TOP {
	public static void main(String[] args) {
		AA.BB.CC c=new AA.BB.CC();
		System.out.println("CC클래스 내부변수 cc = "+c.cc);
	}

}
