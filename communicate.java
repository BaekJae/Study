class 생산자 extends Thread{
	상점 shop;
	public 생산자(상점 shop) {
		this.shop=shop;
	}
	public void run() {
		for(int i=0; i<20; i++) {
			shop.put(i);
			System.out.println("생산자가 : "+i+" 생산");
			try {
				sleep(100);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class 소비자 extends Thread{
	상점 shop;
	public 소비자(상점 shop) {
		this.shop=shop;
	}
	public void run() {
		for(int i=0; i<20; i++) {
			System.out.println("소비자가 : "+shop.get()+" 제품 소비");
			try {
				sleep(100);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class 상점{
	private int goods;
	private boolean available=false;
	
	synchronized int get() {
		try {
			for(;;) {
				if(available != false) break;
				wait();
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		available=false;
		notifyAll();
		return goods;
	}
	
	synchronized void put(int content) {
		try {
			for(;;) {
				if(available != true)break;
				wait();
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		goods=content;
		available=true;
		notifyAll();
	}
}
public class communicate {
	public static void main(String[] args) {
		상점 shop = new 상점();
		생산자 obj1 = new 생산자(shop);
		소비자 obj2 = new 소비자(shop);
		obj1.start();
		obj2.start();
	}
}
