public class Arithmatic1{
	public static void main(String[] args){
		int a,b;
		
		a=10;
		b=++a;
		System.out.println("++a : " + a + ", b: " +b);
		
		a = 10;
		b=a++;	
		System.out.println("a++ : " + a + ", b: " +b);

		a=10;
		b=--a;
		System.out.println("--a : " + a + ", b: " +b);

		a=10;
		b=a--;
		System.out.println("a-- : " + a + ", b: " +b);
	}
}