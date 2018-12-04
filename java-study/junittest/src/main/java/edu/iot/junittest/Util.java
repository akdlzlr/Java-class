package edu.iot.junittest;

public class Util {
	public static <T> Box<T> boxing(T t){
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
	}
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue();
		System.out.println(t1.getClass().getName());
		double v2 = t2.doubleValue();
		System.out.println(t2.getClass().getName());
		return Double.compare(v1, v2);
	}
}
