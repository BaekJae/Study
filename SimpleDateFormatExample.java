import java.util.*;
import java.text.*;
public class SimpleDateFormatExample {
	public static void main(String[] args) {
		String format = "오늘은 yyyy년 MM월 dd이고 E요일이며";
	    format += " 올해에서 D번째 날이며, 올해 w번째 주입니다.";
	    Date date = new Date();
	    SimpleDateFormat sdf = new SimpleDateFormat(format);
	    System.out.println(sdf.format(date));
	}
}
