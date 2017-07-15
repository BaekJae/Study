public class Arithmatic2{
	public static void main(String[] args){
		int a=5, b=6, c,d;

		c=a++ * 4;
		d=++b * 5;

		System.out.println("a: " + a + ",b: " +b);
		System.out.println("c: " + c + ",d: " +d);
	}
}