package classpart;

//학생 클래스 만들기
public class Student {
	
   int studentID;
   String studentName;
   int grade;
   String address;
  
   public void showStudentInfor() {
     System.out.println(studentName + "," + address);  
   }
   
  public String getStudentName() {
	  return studentName;
  }
  
  public void setStudentName(String name) {
	  studentName = name;
	  
  }
   
}
