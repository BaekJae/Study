import java.util.*;
public class HashSetTest2 {
	public static void main(String[] args) {
		String country[]= {"한국","일본","중국","미국","영국","프랑스"};
		Set name = new HashSet();
		int countryLen = country.length;
		int index;
		for(int i=0; i<100; i++) {
			index = (int)(Math.random()*countryLen);
			System.out.print(country[index]+" ");
			name.add(country[index]);
		}
		Iterator it = name.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
