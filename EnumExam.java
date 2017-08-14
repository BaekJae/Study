enum Lang{
	KOR,ENG,JPN
}
public class EnumExam{
	public static void printLang(Lang obj) {
		System.out.println(obj);
	}
	public static void choiceLang(Lang obj) {
		switch(obj) {
		case KOR:
			System.out.println("한국어");
			break;
		case ENG:
			System.out.println("영어");
			break;
		case JPN:
			System.out.println("일본어");
			break;
		}
	}
	public static void main(String[] args) {
		printLang(Lang.KOR);
		choiceLang(Lang.ENG);
		for(Lang obj : Lang.values()) {
			System.out.print(obj+", ");
		}
	}
}

