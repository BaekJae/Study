public class StringBuffer3 {
	public static void main(String[] args) {
		long start,end;
		String str1 = new String("1~1000의 합 :");
		StringBuffer str2 = new StringBuffer("1~1000의 합 :");
		start = System.currentTimeMillis();
		for(int i=1; i<1001; i++) {
			str1 += i;
			str1 += "+";
		}
		end=System.currentTimeMillis();
		System.out.println("String : "+(end-start));
		start = System.currentTimeMillis();
		for(int i=1;i<1001;i++) {
			str2.append(i);
			str2.append("+");
		}
		end = System.currentTimeMillis();
		System.out.println("StringBuffer : "+(end-start));
	}
}
