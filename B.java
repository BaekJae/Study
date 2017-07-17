
class A {
	public int x=10;
	public int y=20;
	public int add() {
		return (x+y);
	}
}

class B{
	public static void main(String[] args) {
		A a=new A();
		
		System.out.println("x=" + a.x);
		System.out.println("y=" +a.y);
		System.out.println("Sum=" +a.add());
	}
}
