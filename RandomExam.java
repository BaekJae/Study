import java.util.*;
public class RandomExam {
	public static void main(String[] args) {
		Random rnd = new Random(System.currentTimeMillis());
		for(int i=0; i<5; i++) {
			System.out.println("float형 난수 : "+rnd.nextFloat());
			System.out.println("boolean형 난수 : "+rnd.nextBoolean());
			System.out.println("int형 난수 : "+rnd.nextInt());
			System.out.println("long형 난수 : "+rnd.nextLong());
			System.out.println("double형 난수 : "+rnd.nextDouble());
			System.out.println("Gaussian형 난수 : "+rnd.nextGaussian());
		}
		System.out.println("-7 부터 12 사이에서 난수 10개 발생");
		for(int i=0; i<10; i++) {
			int nansu = (int)((12-(-7)+1)*rnd.nextDouble()+(-7));
			System.out.print(nansu+"\t");
		}
	}
}
