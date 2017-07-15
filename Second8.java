
public class Second8{
	public static void main(String[] args) {
		int i=0,sum=0;
		while(i<=100) {
			if(i%2==1) {
				sum=sum+i;
			}
			i++;
		}
		System.out.print("1부터 100까지의 홀수 합 : "+sum);
	}
}
