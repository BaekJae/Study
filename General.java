import java.util.*;
public class General {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		
		for(Object o : list)
			System.out.println("list value = "+o);
		}
}
