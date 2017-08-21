import java.awt.*;
public class Choice2 extends Frame {
	String continent[]= {"아시아","유럽","아메리카","아프리카","오세아니아"};
	String country[]= {"대한민국","영국","캐나다","이집트","호주"};
	public Choice2(String str) {
		super(str);
		setLayout(new FlowLayout());
		Label lbl1 = new Label("대륙을 선택하세요!");
		Label lbl2 = new Label("지역을 선택하세요!");
		Choice choice1 = new Choice();
		Choice choice2 = new Choice();
		for(int i=0; i<continent.length;i++) {
			choice1.add(continent[i]);
		}
		for(int i=0; i<country.length;i++) {
			choice2.add(country[i]);
		}
		add(lbl1); add(choice1);
		add(lbl2); add(choice2);
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Choice2("선택 예제 2");
	}
}
	
