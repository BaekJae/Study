class Runnable_EX1 implements Runnable{
	public void run() {
		try {
			for(int i=0; i<20; i++) {
				Thread.sleep(1000);
				System.out.println(i+"¹ø : "+i+"*"+i+"="+(i*i));
			}
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
public class Runnable_EXE1 {
	public static void main(String[] str) {
		Runnable_EX1 thread = new Runnable_EX1();
		Thread obj = new Thread(thread);
		obj.start();
	}

}
