import java.awt.*;
public class Button3 extends Frame {
	Label lbl[] = new Label[100];
	Button btn[] = new Button[100];
	public Button3 (String str) {
		super(str);
		setLayout(new FlowLayout());
		for(int i=0; i<100; i++) {
			lbl[i]= new Label(i+" 레이블");
			btn[i]= new Button(i+" 버튼");
			add(lbl[i]); add(btn[i]);
		}
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Button3("새 버튼 예제3");
	}
}
