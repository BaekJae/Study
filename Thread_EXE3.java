class Thread_EX3 extends Thread{
	public Thread_EX3(String name) {
		super(name);
	}
	public void run() {
		try {
			for(int i=0; i<5; i++) {
				Thread.sleep(1000);
				System.out.println(i+"번-"+getName()+" : 스레드");
			}
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
public class Thread_EXE3 {
	public static void main(String[] str) {
		Thread_EX3 obj1 = new Thread_EX3("첫 번째");
		Thread_EX3 obj2 = new Thread_EX3("두 번째");
		Thread_EX3 obj3 = new Thread_EX3("세 번쨰");
		
		obj1.start();
		obj2.start();
		obj3.start();
	}

}
