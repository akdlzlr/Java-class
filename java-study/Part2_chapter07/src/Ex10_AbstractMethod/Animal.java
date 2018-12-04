package Ex10_AbstractMethod;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();		// 추상 메서드를 사용하기 위해선 추상 클래스여야함 
}
