public class Nansu {
	public static void main(String[] args) {
		int x=1;
		int y=7;
		System.out.println(x+" ~ "+y+" 사이에서 난수 발생");
		for(int i=0; i<10; i++) {
			System.out.print((int)((y-x+1)*Math.random()+x)+",");
		}
	}
}
