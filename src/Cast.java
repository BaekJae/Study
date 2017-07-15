
public class Cast {
	public static void main(String[] args) {
		byte a;
		int b=365;
		double c= 1024.512;
		
		System.out.println("축소 형변환 결과");
		a=(byte)b;
		System.out.println("int 형 365를 byte형으로 바꾸면 : " +a );
		
		b=(int)c;
		System.out.println("double 형 1024.512를 int형으로 바꾸면 : " +b);
		
		a=(byte)c;
		System.out.println("double 형 1024.512를 byte형으로 바꾸면 : " +a);
	}

}
