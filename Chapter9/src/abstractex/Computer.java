package abstractex;

public abstract class Computer {
  // �߻� Ŭ������ ����� �ϱ� ���� �����. 
  // ���� Ŭ�������� ���� �� �ϴ� �κ��� �߻� �޼���� �����.(�� ���� Ŭ������ ����)
	public abstract void display();
	public abstract void typing(); 
		
	public void turnOn() {
		System.out.println("������ �մϴ�.");
	}
	
	public void turnO����() {
		System.out.println("������ ���ϴ�.");
	}
	
}
