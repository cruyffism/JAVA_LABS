package binary;

public class DoubleEx {
	

	public static void main(String[] args) {
    
    var dNum = 3.14; //var은 지역 변수에서만 사용 가능(자료값을 보고 컴파일러가 추론하는 것)
    float fNum = 3.14F;
    
    System.out.println(dNum);
    System.out.println(fNum);
    
  
     var num = 10;   
     System.out.println(num);
     
    // num = 3.14;  >> 이미 인트로 선언 되어 있어서 이렇게 다시 선언은 불가 
    // 자료형 필요 이유 : 변수 선언 시 변수가 사용할 메모리 크기와 타입을 구분하기 위해 ex) int num = 1 
        
    // 지역 변수 자료형 추론 : 변수에 대입되는 값을 보고 컴파일러가 추론  ex) var num = 10 
    
		
	}

}
