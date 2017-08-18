public class String3 {
	public static void main(String[] args) {
		char char_str[]=new char[15];
		String str = "오늘 날씨는 정말 좋습니다.";
		
		System.out.println("str 문자 : "+str.length());
		str.getChars(3, 10, char_str, 0);
		System.out.println("char_str 문자 : "+char_str.length);
		
		for(int i=0; i<char_str.length-8;i++) {
			System.out.print(char_str[i]);
		}
	}
}
