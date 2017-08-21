import java.awt.*;
public class Checkbox3 extends Frame {
	Checkbox os1, os2, os3;
	Checkbox cpu1, cpu2, cpu3;
	CheckboxGroup cbg;
	public Checkbox3(String str) {
		super(str);
		setLayout(new FlowLayout());
		Label lbl1 = new Label("설치되어 있는 OS 선택(복수)");
		add(lbl1);
		os1 = new Checkbox(" 안드로이드");
		os2 = new Checkbox(" 리눅스");
		os3 = new Checkbox(" 윈도우 8");
		add(os1); add(os2); add(os3);
		Label lbl2 = new Label("Cpu 종류 선택");
		add(lbl2);
		cbg = new CheckboxGroup();
		cpu1 = new Checkbox("AMD",cbg,true);
		cpu2 = new Checkbox("Intel",cbg,false);
		cpu3 = new Checkbox("ARM",cbg,false);
		add(cpu1); add(cpu2); add(cpu3);
		setSize(450,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Checkbox3("체크 박스 예제 3");
	}
}
