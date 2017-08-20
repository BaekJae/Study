public class WCSample<T> {
	T v;
	public void setValue(T t) {
		v = t;
	}
	public T getValue() {
		return v;
	}
	
	public static void main(String[] args) {
		WCSample <Integer> obj1 = new WCSample<Integer>();
		obj1.setValue(new Integer(10));
		WCSample <Double> obj2 = new WCSample<Double>();
		obj2.setValue(new Double(0.5));
		WCSample <String> obj3 = new WCSample<String>();
		obj3.setValue(new String("WildCard"));
		
		WCSample<?> obj = obj1;
		System.out.println("obj1 °ª : "+obj.getValue());
		obj = obj2;
		System.out.println("obj2 °ª : "+obj.getValue());
		obj = obj3;
		System.out.println("obj3 °ª : "+obj.getValue());
	}
}
