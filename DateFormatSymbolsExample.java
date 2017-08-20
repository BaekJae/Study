import java.util.*;
import java.text.*;
public class DateFormatSymbolsExample {
	public static void main(String[] args) {
		String week[ ] = {"ìí","êÅ","ûı","â©","ÙÊ","Ğİ","÷Ï"};
		String format = "¿À´ÃÀº yyyy³â MM¿ù ddÀÏ E¿äÀÏÀÔ´Ï´Ù.";
		DateFormatSymbols obj = new DateFormatSymbols(Locale.KOREA);
		obj.setShortWeekdays(week);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(format,obj);
		System.out.println(sdf.format(date));
	}
}
