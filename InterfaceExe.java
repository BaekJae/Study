interface 자동차 {
	void run();
}
interface 배{
	void navigation();
}
interface 수륙양용자동차 extends 자동차, 배{
	void floating();
}
class Interface implements 수륙양용자동차{
	public void run() {
		System.out.println("육지를 달리는 능력");
	}
	public void navigation() {
		System.out.println("바다를 항해하는 능력");
	}
	public void floating(){
		System.out.println("공중에 떠있는 능력");
	}
}
class InterfaceExe {
	public static void main(String[] args) {
		Interface obj = new Interface();
		obj.run();
		obj.navigation();
		obj.floating();
	}

}
