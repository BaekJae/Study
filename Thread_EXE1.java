class Thread_EX1 extends Thread {
	public void run() {
		try {
			for(int i=0; i<30; i++) {
				Thread.sleep(1000);
				System.out.println(i+"¹ø : "+i+"*"+i+"="+i*i);
			}
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
public class Thread_EXE1 {
	public static void main(String[] str) {
		Thread_EX1 thread = new Thread_EX1();
		thread.start();
	}

}
