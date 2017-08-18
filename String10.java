public class String10 {
	public static void main(String[] args) {
		String str1 = "자바";
		String str2 = "JAVA";
		String str3 = "java";
		System.out.println("문자열 str1 = "+str1);
		System.out.println("문자열 str2 = "+str2);
		System.out.println("문자열 str3 = "+str3);
		System.out.println("JAVA와 java는 "+((str2.equals(str3))?"동일":"틀림"));
		System.out.println("JAVA와 java는 "+((str2.equalsIgnoreCase(str3))?"동일":"틀림"));
	}
}
