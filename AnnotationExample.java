package com.annotation;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
public class AnnotationExample {
	public static void main(String[] args) {
	}
	@Override
	@TODO(user="È«±æµ¿",id=1,comments="1¹Ý")
	public String toString() {
		return "User Info";
	}
	@Deprecated
	@TODO(user="È«±æ¼ø",id=2,comments="2¹Ý")
	public static void toClassInfo() {
		System.out.println("Class Info");
	}
	@SuppressWarnings({"unchecked","deprecation"})
	@TODO(comments="Dummy!")
	public static void genericsTest() throws Exception{
		throw new Exception();
	}
}