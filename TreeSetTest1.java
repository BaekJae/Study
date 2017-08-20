import java.util.*;
public class TreeSetTest1 {
	public static void main(String[] args) {
		char ch = ' ';
		TreeSet set = new TreeSet();
		for(int i=0; i<95; i++) {
			System.out.print(ch+" ");
			set.add(ch++);
		}
		System.out.println();
		System.out.println("Alpabet : "+set.subSet('A','Z'));
		System.out.println("%보다 작은 값 : "+set.headSet('%'));
		System.out.println("x보다 큰 값    : "+set.tailSet('x'));
	}
}
