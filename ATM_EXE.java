class ATM{
	private int total;
	public ATM(int total) {
		this.total=total;
	}
	synchronized void deposit(int amount, String name) {
		total += amount;
		System.out.println(name+" : 입금 금액 : "+amount);
	}
	synchronized void withdraw(int amount, String name) {
		if((total-amount)>0) {
			total -=amount;
			System.out.println(name+" : 출금 금액 : "+amount);
		}
		else {
			System.out.println(name+"님 잔액이 부족해 출금할 수 없습니다.");
		}
	}
	public void getTotal() {
		System.out.println("현재 계좌 잔액은: "+total);
	}
}
class ATM_USER extends Thread{
	boolean flag = false;
	ATM obj;
	public ATM_USER(ATM obj, String name) {
		super(name);
		this.obj = obj;
	}
	public void run() {
		for(int i=0; i<5; i++) {
			try {
				sleep(500);
			}catch(InterruptedException e) {}
			
			if(flag) {
				obj.deposit((int)(Math.random()*10000),getName());
				obj.getTotal();
			}
			else {
				obj.withdraw((int)(Math.random()*10000),getName());
				obj.getTotal();
			}
			flag=!flag;
		}
	}
}
public class ATM_EXE {
	public static void main(String[] args) {
		ATM obj = new ATM(10000);
		ATM_USER user1 = new ATM_USER(obj,"홍길동");
		ATM_USER user2 = new ATM_USER(obj,"홍길순");
		ATM_USER user3 = new ATM_USER(obj,"최재규");
		
		user1.start();
		user2.start();
		user3.start();
	}
}
