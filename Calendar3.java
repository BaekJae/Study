import java.util.*;
public class Calendar3 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		System.out.println("오늘은 : "+date);
		System.out.println("오늘은 올해의 : "+ cal.get(Calendar.DAY_OF_YEAR)+"날입니다.");
		System.out.println("오늘은 이번 주 : "+cal.get(Calendar.DAY_OF_WEEK)+"요일입니다.");
		System.out.println("오늘은 올해의 : "+cal.get(Calendar.WEEK_OF_YEAR)+"주입니다.");
	}
}
