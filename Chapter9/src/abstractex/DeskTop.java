package abstractex;

public class DeskTop extends Computer {
// DeskTop이  Computer로부터 상속을 받았다.
	@Override
	public void display() {
      System.out.println("DeskTop display()");
	} 

	@Override
	public void typing() {
		System.out.println("DeskTop Typing()");
	}
	
}
