import java.awt.*;
public class List1 extends Frame {
	public List1(String str) {
		super(str);
		setLayout(new FlowLayout());
		List list = new List(5,false);
		list.add("286AT");
		list.add("386DX");
		list.add("486DX66");
		list.add("펜티엄");
		list.add("펜티엄4");
		list.add("애슬론XP");
		add(list);
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new List1("리스트 예제 1");
	}
}
