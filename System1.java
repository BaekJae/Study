public class System1 {
	public static void main(String[] args) {
		long start,end;
		start=System.currentTimeMillis();
		for(int i=0; i<100000000;i++) {
		}
		end =System.currentTimeMillis();
		System.out.println("1억 번 반복 수행에 걸린 시간  "+(end-start)+" 밀리초");
	}
}
