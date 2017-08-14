import com.annotation.TODO;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
public class AnnotationCheck {
	public static void main(String[] args) {
		try {
			for(Method method : AnnotationCheck.class.getClassLoader().loadClass(("com.annotation.AnnotationExample")).getMethods()) {
				if(method.isAnnotationPresent(TODO.class)) {
					try {
						for(Annotation an : method.getDeclaredAnnotations()) {
							System.out.println("Annotation in Method '"+method+"' : "+an);
						}
						TODO todo = method.getAnnotation(TODO.class);
						if(todo.id()==1) {
							System.out.println("TODO annotation id value "+method);
						}
					}catch(Throwable ex) {
						ex.printStackTrace();
					}
				}
			}
		}catch(SecurityException|ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
