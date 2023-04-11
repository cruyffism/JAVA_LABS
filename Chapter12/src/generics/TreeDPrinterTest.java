package generics;

public class TreeDPrinterTest {

	public static void main(String[] args) {

		TreeDPrinter<Powder> printer =new TreeDPrinter<Powder>(); 
		// T대신에 내가 사용할 참조형 변수(클래스 이름) 사용 여기선 <Powder>
		printer.setMaterial(new Powder());
		Powder powder = printer.getMaterial();
		System.out.println(printer);
		
		TreeDPrinter<Plastic> printerPlastic =new TreeDPrinter<Plastic>(); 
		printerPlastic.setMaterial(new Plastic());
		Plastic plastic = printerPlastic.getMaterial();
		System.out.println(printerPlastic);
		
		printerPlastic.printing();
		
	}

}
