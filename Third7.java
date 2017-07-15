
public class Third7 {
	public static void main(String[] args) {
		int i,sum=0;
		for(i=1; i<=100; i++) {
			if(i%10==0) {
				sum+=i;
				System.out.println("1부터 "+i+"까지의 합 : "+sum);
				continue;
			}
			sum+=i;
		}
	}
}
