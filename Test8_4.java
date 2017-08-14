import java.util.Random;
class Player extends Thread{
	String player_name;
	public Player(String name) {
		this.player_name=name;
	}
	public void run() {
		try {
			Random oRandom = new Random();
			int i = oRandom.nextInt(2);
			String data = "";
			switch(i) {
			case 0:
				data = "가위";
				break;
			case 1:
				data = "바위";
				break;
			case 2:
				data = "보";
				break;
			}
			System.out.println(player_name+"은 "+data+"를 냈습니다.");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
public class Test8_4 {
	public static void main(String[] str) {
		Player a= new Player("홍길동");
		Player b= new Player("존");
		a.start();
		b.start();
	}
}
