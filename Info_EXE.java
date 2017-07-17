class Info{
	private String name;
	private int age;
	private char sex;
	public Info(String n, int a, char s) {
		name = n;
		age = a;
		sex = s;
	}
	public void display() {
		System.out.println("이름="+name+" 나이="+age+" 성별="+sex);
	}
}
public class Info_EXE {
	public static void main(String[] args) {
		Info info1= new Info("홍길동",20,'m');
		Info info2= new Info("홍길순",19,'f');
		info1.display();
		info2.display();
	}
}
