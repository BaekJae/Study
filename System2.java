public class System2 {
	public static void main(String[] args) {
		for(int i=1; i<100000000;i++) {
			if((i%2==0)&&(i%12==0)&&(i%30==0)){
				System.out.println("i의 값은 "+i);
				System.exit(0);
			}
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
