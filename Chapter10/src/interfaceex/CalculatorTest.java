package interfaceex;

public class CalculatorTest {
     // Ŭ���̾�Ʈ�ڵ�
	public static void main(String[] args) {
        /*
		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc(); //Ÿ�Ի��
		System.out.println(calc.add(num1, num2));
		
		calc.description();
	    */
		
		int[] arr = {1,2,3,4,5};
		int sum = Calc.total(arr);
		System.out.println(sum);
	}
	
}
