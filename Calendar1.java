import java.util.*;
public class Calendar1 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println("Calendar 클래스를 이용한 시간과 날짜 출력");
		System.out.print(cal.get(Calendar.YEAR)+"년 ");
		System.out.print((cal.get(Calendar.MONTH)+1)+"월 ");
		System.out.print(cal.get(Calendar.DATE)+"일 ");
		System.out.print(cal.get(Calendar.HOUR)+"시 ");
		System.out.print(cal.get(Calendar.MINUTE)+"분 ");
		System.out.print(cal.get(Calendar.SECOND)+"초");
	}
}
