
public class Dowhile {
	public static void main(String[] args) {
		int cnt=1, sum=0;
		do {
			sum+=cnt;
			cnt++;
		} while(cnt<=100);
		System.out.println("1~100������ ���� " +sum);
	}
}
