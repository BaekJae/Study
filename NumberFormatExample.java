import java.util.*;
import java.text.*;
public class NumberFormatExample {
	public static void main(String[] args) {
		double num = 11582.112157243;
		NumberFormat nf = NumberFormat.getInstance();
		nf.setGroupingUsed(false);
		nf.setMinimumFractionDigits(5);
		System.out.println(nf.format(num));
		nf = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nf.format(num));
		nf = NumberFormat.getCurrencyInstance(Locale.KOREA);
		System.out.println(nf.format(num));
		nf = NumberFormat.getPercentInstance();
		nf.setGroupingUsed(false);
		nf.setMinimumFractionDigits(3);
		System.out.println(nf.format(num));
	}
}
