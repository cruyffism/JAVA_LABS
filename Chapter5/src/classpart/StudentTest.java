package classpart;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(100, "이순신");
	  	studentLee.studentName = "이순신";
	  	studentLee.studentID = 100;
	  	studentLee.address = "서울시 영등포구 여의도동";
		  
	  	Student studentKim = new Student();
	  	studentKim.studentName = "김유신";
	  	studentKim.studentID = 101;
	  	studentKim.address = "미국 산호세";
		
	  	// studentLee >> 이런 것을 참조 변수라고 부른다. 
	 	studentLee.showStudentInfor();
	 	studentKim.showStudentInfor();
	 	
	 	// 주소값 출력 32비트짜리 어드레스?, 참조값이라고 부른다.
	 	System.out.println(studentLee);
	 	System.out.println(studentLee);
	 	System.out.println(studentKim);
	}
}
