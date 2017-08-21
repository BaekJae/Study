import java.awt.*;
public class Button2 extends Frame {
	Label lbl1, lbl2, lbl3;
	Button btn1, btn2, btn3;
	public Button2(String str) {
		super(str);
		setLayout(new FlowLayout());
		lbl1 = new Label("가위");
		lbl2 = new Label("바위");
		lbl3 = new Label(" 보 ");
		btn1 = new Button("가위");
		btn2 = new Button("바위");
		btn3 = new Button(" 보 ");
		add(lbl1); add(btn1);
		add(lbl2); add(btn2);
		add(lbl3); add(btn3);
		lbl1.setEnabled(false);
		btn3.setEnabled(false);		
		setSize(300,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Button2("버튼 예제 2");
	}
}
