interface component{
	public int i = 10;
}

class A implements component{
	int sta =  i;
}
class AExe {
	public static void main(String[] args) {
		A obj = new A();
		
		obj.sta=obj.sta+10;
		System.out.println(obj.sta);
	}

}
