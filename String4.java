public class String4 {
	public static void main(String[] args) {
		int i;
		String str= "2002 WorldCup Korea";
		
		System.out.println("정상 문자열 : "+str);
		System.out.print("문자열 뒤집기 : ");
		for(i = str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
		System.out.print("\n짝수 문자열 : ");
		for(i=0;i<str.length();i++) {
			if(i%2 !=0) System.out.print(str.charAt(i));
			else System.out.print(" ");
		}
	}
}
