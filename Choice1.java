import java.awt.*;
public class Choice1 extends Frame {
	public Choice1(String str) {
		super(str);
		setLayout(new FlowLayout());
		Label lbl = new Label("국가를 선택하세요!");
		Choice choice = new Choice();
		choice.add("대한민국");
		choice.add("미 국");
		choice.add("일 본");
		choice.add("프랑스");
		choice.add("중 국");
		choice.add("러시아");
		add(lbl);
		add(choice);
		setSize(200,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Choice1("Choice 예제 1");
	}
}
