
public class Array1 {
	public static void main(String[] args) {
		int sum=0;
		int month[];
		month = new int[12];
		month[0]=31;
		month[1]=28;
		month[2]=31;
		month[3]=30;
		month[4]=31;
		month[5]=30;
		month[6]=31;
		month[7]=31;
		month[8]=30;
		month[9]=31;
		month[10]=30;
		month[11]=31;
		
		for(int i=0; i<12; i++) {
			sum+=month[i];
			
		}
		System.out.println("모든 달의 합은 : " +sum );
	}

}
