class Thread_EX5 extends Thread{
	public Thread_EX5(String name) {
		super(name);
	}
	public void run() {
		System.out.println(getName()+" : 스레드");
	}
}
public class Thread_EXE5 {
	public static void main(String[] str) {
		Thread_EX5 obj1 = new Thread_EX5("첫 번째");
		Thread_EX5 obj2 = new Thread_EX5("두 번째");
		Thread_EX5 obj3 = new Thread_EX5("세 번쨰");
		
		obj1.setPriority(2);
		obj2.setPriority(7);
		obj3.setPriority(5);
		
		obj1.start();
		obj2.start();
		obj3.start();
	}
}
