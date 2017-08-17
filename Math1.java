public class Math1 {
	public static void main(String[] args) {
		int a = -100;
		double b = 10.2;
		System.out.println(a+" => abs : "+Math.abs(a));
		System.out.println(b+" => ceil : "+Math.ceil(b));
		System.out.println(b+" => floor : "+Math.floor(b));
		System.out.println("max(a,b) = "+Math.max(a,b));
		System.out.println("min(|a|,b) = " +Math.min(Math.abs(a),b));
		System.out.println("10.5 => rint : "+Math.rint(10.5));
		System.out.println("10.7 => rint : "+Math.rint(10.7));
		System.out.println(b+" => rint : "+Math.rint(b));
		
		for(int i=0; i<=90; i+=5) {
			System.out.println("Sin"+i+" = "+Math.sin(i*Math.PI/180));
			System.out.println("Cos"+i+" = "+Math.cos(i*Math.PI/180));
		}
	}
}
