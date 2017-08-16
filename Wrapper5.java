public class Wrapper5 {
	public static void main(String[] args) {
		int s_data=0;
		short max = Short.MAX_VALUE;
		short min = Short.MIN_VALUE;
		Short s = new Short("386");
		s_data=s.intValue();
		System.out.println("s_data 값은 "+s_data+" 최대값 : "+max+" 최소값 : "+min);
	}
}
