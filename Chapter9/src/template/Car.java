package template;

public abstract class Car {
    // ���� �õ��� �Ѱ� ���°� ���������� ����̳�ai�Ŀ� ���� ����� �ٸ� 
	
	
	public abstract void drive();
	public abstract void stop();
	
	public abstract void wiper();
	
	public void washCar() {}   // ������ �ϴ°�, �� �޼���?
	
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�");
	}
	
	//�ٲ�� �ȵǴ� �ó������� ���̳� ���� ! 
	// �̰� ���ø� �޼����� 
	public final void run() {
	startCar();
	drive();
	wiper();
	stop();
	washCar(); // ������ �ϴ°�, �� �޼���?
	turnOff();
	
	}
		
 }
