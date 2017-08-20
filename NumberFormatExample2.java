import java.text.*;
public class NumberFormatExample2 {
	public static void main(String[] args) {
		double num = 107804.6543;
		DecimalFormat df = (DecimalFormat)NumberFormat.getInstance();
		System.out.println(df.toPattern()+" -> "+df.format(num));
		df = new DecimalFormat("###0.000");
		System.out.println(df.toPattern()+"     -> "+df.format(num));
	}
}
