class Thread_EX4 extends Thread{
	public Thread_EX4(String name) {
		super(name);
	}
	public void run() {
		System.out.println(getName()+" : 스레드");
	}
}
class Thread_EXE4 {
	public static void main(String[] str) {
		Thread_EX4 obj1 = new Thread_EX4("최고 우선 순위");
		Thread_EX4 obj2 = new Thread_EX4("중간 우선 순위");
		Thread_EX4 obj3 = new Thread_EX4("최저 우선 순위");
		
		obj1.setPriority(Thread.MAX_PRIORITY);
		obj2.setPriority(Thread.NORM_PRIORITY);
		obj3.setPriority(Thread.MIN_PRIORITY);
		
		obj1.start();
		obj2.start();
		obj3.start();
	}

}
