import java.util.*;
public class HashSetTest1 {
	public static void main(String[] args) {
		Object [] data = {"1","kor","1","2","10","10"};
		Set hashSet = new HashSet();
		for(int i=0; i<data.length; i++) {
			hashSet.add(data[i]);
		}
		System.out.println(hashSet);
	}
}
