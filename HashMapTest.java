import java.util.*;
public class HashMapTest {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("미국", "1");
		map.put("한국", "82");
		map.put("이집트", "20");
		map.put("그리스", "30");
		map.put("프랑스", "33");
		map.put("영국", "44");
		map.put("브라질", "55");
		
		Set set = map.keySet();
		System.out.println("국가명 : "+set);
		set=map.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("국가 : "+e.getKey()+" - 번호 : "+e.getValue());
		}
	}
}
