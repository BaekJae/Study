import java.util.Date;
class Timer extends Thread{
	public Timer(String name) {
		super(name);
	}
	public void run() {
		try {
			while(true) {
				Thread.sleep(1000);
				System.out.println("현재시간:"+new Date());
			}
		}
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
}
public class Test8_5 {
	public static void main(String[] str) {
		Timer obj = new Timer("타이머");
		obj.start();
	}
}
