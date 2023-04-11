package classpart;

//학생 클래스 만들기
public class Student {

	int studentID;            //  4개의 멤버 변수 선언
	String studentName;
	int grade;
	String address;

	public Student() {}  // 디폴트 생성자(클래스랑 이름이 같음 >> Student)
	                     // 다른 클래스에서 호출 시 기본적으로 이 디폴트 생성자 메소드가 호출이 된다. 
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		
	}
	  // 매개변수가 있는 생성(id, name)
	  // 위와 같은 경우를 생성자 오버로드라고 한다.(디폴트 생성자와 같이 작성해주는게 좋음)

	public void showStudentInfor() {
		System.out.println(studentName + "," + address); // 이름, 주소 출력하는 메서드 추가 
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String name) {
		studentName = name;

	}

	

}
