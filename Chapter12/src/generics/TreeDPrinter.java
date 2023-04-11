package generics;

public class TreeDPrinter<T extends Material> {

	private T  material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	
	

	@Override
	public String toString() {
      return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
	
	
	// 제네릭 프로그래밍 방식으로 만든 제네릭 클래스, 매개변수 타입 T로 대체
	
}
