
public class Sample 
{
	double x;
	double y;
	
	public Sample(double a, double b) {
		x=a;
		y=b;
	}
	
	public double add() {
		return (x+y);
	}
	
	public double sub() {
		return (x-y);
	}
	
	public double mul() {
		return (x*y);
	}
	
	public double div() {
		return (x/y);
	}
	
	public static void main(String[] args) {
		Sample sample = new Sample(10.0,3.5);
		System.out.println("더하기 : " +sample.add());
		System.out.println("빼기 : " +sample.sub());
		System.out.println("곱하기 : " +sample.mul());
		System.out.println("나누기 : " +sample.div());
	}
}
