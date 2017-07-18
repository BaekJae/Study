
public class VargsTest {
	public void input(int...datas) {
		System.out.println("총 데이터 개수 : "+datas.length );
		for (int temp : datas) {
			System.out.println("데이터 : "+temp);
		}
	}
public static void main(String[] args) {
	VargsTest vt= new VargsTest();
	vt.input(1,2,5,-10,20,100);
 }
}
