
public class Second9 {
	public static void main(String[] args) {
		int cnt, sum=0;
		for(cnt=1; cnt<=100; cnt++) {
			if(cnt%5!=0) {
				sum+=cnt;
			}
		}
		System.out.println("5의 배수가 아닌 수의 합 : " +sum);
	}
}
