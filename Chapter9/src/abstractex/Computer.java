package abstractex;

public abstract class Computer {
  // 추상 클래스는 상속을 하기 위해 만든다. 
  // 상위 클래스에서 구현 못 하는 부분을 추상 메서드로 만든다.(즉 하위 클래스에 위임)
	public abstract void display();
	public abstract void typing(); 
		
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOㄹㄹ() {
		System.out.println("전원을 끕니다.");
	}
	
}
