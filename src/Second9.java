
public class Second9 {
	public static void main(String[] args) {
		int cnt, sum=0;
		for(cnt=1; cnt<=100; cnt++) {
			if(cnt%5!=0) {
				sum+=cnt;
			}
		}
		System.out.println("5�� ����� �ƴ� ���� �� : " +sum);
	}
}
