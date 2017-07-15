
public class Third8 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=1000; i++) {
			for(int k=1; k<=i; k++) {
				if(i%k==0) 
					sum+=k;
				}
				if((sum-i)==i)
					System.out.println(i+"는 완전수입니다!");
				sum=0;
			}
		}
	}


