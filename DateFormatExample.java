import java.util.*;
import java.text.*;
public class DateFormatExample {
	public static void main(String[] args) {
		Date date = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
		System.out.println("¹Ì±¹ : "+df.format(date));
		
		df = DateFormat.getDateInstance(DateFormat.FULL, Locale.KOREA);
		System.out.println("FULL : "+df.format(date));
		df = DateFormat.getDateInstance(DateFormat.LONG, Locale.KOREA);
		System.out.println("LONG : "+df.format(date));
		df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.KOREA);
		System.out.println("MEDIUM : "+df.format(date));
		df = DateFormat.getDateInstance(DateFormat.SHORT, Locale.KOREA);
		System.out.println("SHORT : "+df.format(date));
		df = DateFormat.getTimeInstance(DateFormat.FULL, Locale.KOREA);
		System.out.println(df.format(date));
		df = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL,Locale.KOREA);
		System.out.println(df.format(date));
	}
}
