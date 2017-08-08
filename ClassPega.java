interface 새{
	public long speed=80;
	public void fly();
}

interface 말{
	public void run();
}

class 페가수스 implements 새,말{
	public void fly() {
		System.out.println("하늘을 난다!");
	}
	public void run() {
		System.out.println("대륙을 달린다!");
	}
}

class ClassPega {
	public static void main(String[] args) {
		페가수스 pega = new 페가수스();
		pega.fly();
		pega.run();
	}

}
