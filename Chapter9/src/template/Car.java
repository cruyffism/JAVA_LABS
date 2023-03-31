package template;

public abstract class Car {
    // 차가 시동을 켜고 끄는건 동일하지만 사람이냐ai냐에 따라 방식이 다름 
	
	
	public abstract void drive();
	public abstract void stop();
	
	public abstract void wiper();
	
	public void washCar() {}   // 재정의 하는거, 훅 메서드?
	
	
	public void startCar() {
		System.out.println("시동을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다");
	}
	
	//바뀌면 안되는 시나리오를 파이널 선언 ! 
	// 이게 템플릿 메서드임 
	public final void run() {
	startCar();
	drive();
	wiper();
	stop();
	washCar(); // 재정의 하는거, 훅 메서드?
	turnOff();
	
	}
		
 }
