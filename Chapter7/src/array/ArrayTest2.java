package array;

public class ArrayTest2 {

	public static void main(String[] args) {

		double[] num = new double[5];
		num[0] = 10.0;
		num[1] = 20.0;
		num[2] = 30.0;
		
		double total = 0.0;
		for(int i = 0; i<num.length; i++) {
			total += num[i];
			
		} 
	 /* total += num[i];
		total = total +  num[0];
		0 = 0+ 10
		10 = 10 +20
		30 = 30 + 30
		60 = 60+ 0
		60 = 60 + 0
     */          
		System.out.println(total);
	}

}
