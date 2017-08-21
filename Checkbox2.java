import java.awt.*;
public class Checkbox2 extends Frame {
	Checkbox cbx1, cbx2, cbx3, cbx4;
	CheckboxGroup cbg;
	public Checkbox2(String str) {
		super(str);
		setLayout(new FlowLayout());
		Label lbl = new Label("좋아하는 계절은 어느 것인가요?", Label.CENTER);
		add(lbl);
		cbg = new CheckboxGroup();
		cbx1 = new Checkbox("봄",cbg,true);
		cbx2 = new Checkbox("여름",cbg,false);
		cbx3 = new Checkbox("가을",cbg,false);
		cbx4 = new Checkbox("겨울",cbg,false);
		add(cbx1); add(cbx2); add(cbx3); add(cbx4);
		setSize(240,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Checkbox2("체크 박스 예제 2");
	}
}
