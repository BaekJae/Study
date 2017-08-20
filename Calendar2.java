import java.util.*;
public class Calendar2 {
	public static void main(String[] args) {
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal2.set(2015,0,1,0,0,0);
		
		if(cal1.after(cal2))
			System.out.println("현재 시간은 2015/1/1일 후입니다.");
		else if(cal1.before(cal2))
			System.out.println("현재 시간은 2015/1/1일 전입니다.");
		else if (cal1.equals(cal2))
			System.out.println("현재 시간은 2015/1/1일 입니다.");
	}
}
