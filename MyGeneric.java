public class MyGeneric<E> {
	private E[] m_elements;
	private int m_size;
	private int m_count=0;
	
	public MyGeneric(int size) {
		m_size = size;
		m_elements = (E[]) new Object[m_size];
	}
	
	public void add(E value) {
		if(m_count >= m_size)
			throw new IndexOutOfBoundsException("overflow element size");
		else
			m_elements[m_count++]=value;
	}
	
	public E get (int index) {
		if(index >= m_count)
			throw new ArrayIndexOutOfBoundsException(index);
		else
			return m_elements[index];
	}
	
	public int size() {
		return m_count;
	}
	
	public static void main(String[] args) {
		MyGeneric<Integer> list = new MyGeneric<Integer>(10);
		
		for(int i=0; i<5; i++) {
			list.add(i);
		}
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" , ");
		}
	}
}
