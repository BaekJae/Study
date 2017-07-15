
public class Second6 {
	public static void main(String[] args) throws Exception{
		int score=85,mok;
		char grade;
		mok=score/10;
		switch(mok) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
				
		}
		System.out.println(score + "에 대한 학점 : " + grade);
	}
}
