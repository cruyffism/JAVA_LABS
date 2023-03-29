package classpart;

//학생 클래스 만들기
public class Student {

	int studentID;
	String studentName;
	int grade;
	String address;

	public Student() {}  // 디폴트 생성자, 메소드
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		
	} // 매개변수가 있는 생성자
	  // 위와 같은 경우를 생성자 오버로드라고 한다. 

	public void showStudentInfor() {
		System.out.println(studentName + "," + address);
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String name) {
		studentName = name;

	}

	public static void main(String[] args) {

	}

}
