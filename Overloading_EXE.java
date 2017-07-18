class Overloading{
	void display() {
		System.out.println(" 전달된 값 없음");
	}
	void display(int a ) {
		System.out.println(" A 값은 "+a);
	}
	void display(String name) {
		System.out.println(" 내 이름은 "+name);
	}
	void display(String name, int age) {
		System.out.println("내 이름은 "+name+" 나이는 "+age);
	}
}
public class Overloading_EXE {
	public static void main(String[] args) {
		Overloading over= new Overloading();
		over.display();
		over.display(100);
		over.display("홍길동");
		over.display("홍길순",26);
	}
}
