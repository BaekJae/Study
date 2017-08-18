public class String7 {
	public static void main(String[] args) {
		String str = "몇 개의 단어가 포함되어 있을까요?";
		int count=0;
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)==' ')
				count++;
		}
		System.out.println(str+" 문장 안에 포함된 단어는 "+(count+1)+"개");
	}
}
