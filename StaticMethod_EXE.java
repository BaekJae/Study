class StaticMethod{
	static int kor;
	static int eng;
	static int math;
	static double average() {
		int total = kor + eng + math;
		return (total/3.0);
	}
}
public class StaticMethod_EXE {
	public static void main(String[] args) {
		StaticMethod sm = new StaticMethod();
		sm.kor=70;
		sm.eng=50;
		sm.math=100;
		System.out.println(" ЦђБе = "+sm.average());
		System.out.println(" ЦђБе = "+StaticMethod.average());
	}
}
