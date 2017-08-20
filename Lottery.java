import java.util.*;
public class Lottery {
	static Vector lottery = new Vector();
	public static void main(String[] args) {
		System.out.println("1~10000 사이의 복권 추첨입니다.");
		for(int i=1; i<=3;i++) {
			for(int j=1; j<=i; j++) {
				if(i>1) {
					System.out.println(i+"등 복권("+j+") : "+nansu(System.currentTimeMillis()));
				}
				else if(i==1) {
					System.out.println(i+"등 복권은 : "+nansu(System.currentTimeMillis()));
				}
			}
		}
	}
	public static int nansu( long seed) {
		Random rnd = new Random();
		int nansu=0;
		rnd.setSeed(seed);
		while(true) {
			nansu=(int)((10000-1+1)*rnd.nextDouble()+1);
			if(!lottery.contains(new Integer(nansu)))
				break;
		}
		lottery.addElement(new Integer(nansu));
		return nansu;
	}
}
