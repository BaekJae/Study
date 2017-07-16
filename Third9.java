
public class Third9 {
	public static void main(String[] args) throws Exception {
		int i,num,sum_odd=0,sum_even=0;
		System.out.println("1과 2중 하나를 입력해주세요. : ");
		num = System.in.read();
		for(i = 1;i <= 100;i++) {
			if(i%2==0) {
				sum_even+=i;
			}
			else {
				sum_odd+=i;
			}
		}
		if(num=='1') {
			System.out.println("1-2+3-...+100 : " +(sum_odd-sum_even));
		}
		else if(num=='2') {
			System.out.println("-1+2-3+...+100 : " +(sum_even-sum_odd));
		}
	}

}
