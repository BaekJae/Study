import java.awt.*;
public class Button1 extends Frame {
	Button btn1, btn2, btn3;
	public Button1(String str) {
		super(str);
		setLayout(new FlowLayout());
		btn1 = new Button(" 가위 ");
		btn2 = new Button(" 바위 ");
		btn3 = new Button("  보  ");
		add(btn1); add(btn2); add(btn3);
		setSize(200,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Button1("버튼 예제 1");
	}
}
