import java.util.ArrayList;
public class ArrayTest {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(5);
		al.add(10);
		al.add(15);
		
		for(int i=0; i<al.size();i++) {
			System.out.println(al.get(i));
		}
	}
}
