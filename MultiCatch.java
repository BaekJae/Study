import java.io.*;
public class MultiCatch {
	public static void main(String[] args) {
		System.out.println("값을 입력해 주세요 >> ");
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String message = in.readLine();
			int data = Integer.parseInt(message);
		}
		catch(IllegalArgumentException e) {
			System.out.println("error : "+e.getMessage());
		}
		catch(IOException e) {
			System.out.println("error : "+e.getMessage());
		}
		catch(Exception e) {
			System.out.println("error : "+e.getMessage());
		}
	}
}
