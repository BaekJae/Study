class This1{
	private int kor;
	private int eng;
	private int math;
	public This1(int kor, int eng, int math) {
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	public int total() {
		return(this.kor+this.eng+this.math);
	}
}
class This1_EXE {
	public static void main(String[] args) {
		This1 t=new This1(100,70,50);
		System.out.println("รัมก "+t.total());
	}
}
