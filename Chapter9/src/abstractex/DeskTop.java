package abstractex;

public class DeskTop extends Computer {
// DeskTop��  Computer�κ��� ����� �޾Ҵ�.
	@Override
	public void display() {
      System.out.println("DeskTop display()");
	} 

	@Override
	public void typing() {
		System.out.println("DeskTop Typing()");
	}
	
}
