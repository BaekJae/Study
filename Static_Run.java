class Static {
	static int num=0;
	int a=10;
	int b=20;
}

class Static_Run{
	public static void main(String[] args) {
		Static s1=new Static();
		Static s2=new Static();
		s1.num=10;
		s1.a=20;
		s1.b=30;
		System.out.println("s1의 값 num="+s1.num+" a="+s1.a+" b="+s1.b);
		System.out.println("s2의 값 num="+s2.num+" a="+s2.a+" b="+s2.b);
		System.out.println("클래스 변수 num = "+Static.num);
	}
}
