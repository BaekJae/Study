public class String9 {
	public static void main(String[] args) {
		String str ="I Love Korea!";
		char [] buffer = new char[7];
		str.getChars(0,6,buffer,0);
		System.out.print("buffer[] :");
		for(int i=0; i<7-1; i++) {
			System.out.print(buffer[i]);
		}
	}
}
