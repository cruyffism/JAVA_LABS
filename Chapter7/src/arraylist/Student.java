package arraylist;

import java.util.ArrayList;

public class Student {

	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectList; // Subject 클래스가 list로 
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName =studentName;
		
		subjectList = new ArrayList<Subject>();
		
	}
	
	public void addSubject(String name, int score) {
		
		Subject subject = new Subject(); // 인스턴스 생성 
		subject.setName(name);
		subject.setScorePoint(score);
		
		subjectList.add(subject);  // .add를 해줘야 리스트에 들어간다. 
		
	}
	
	public void showStudentInfo() {
		
		int total = 0;
		for(Subject subject : subjectList) {
			total += subject.getScorePoint();
			
			System.out.println("학생 " + studentName + "님의" + subject.getName()+ "과목의 성적은 "
					+ subject.getScorePoint() + "점 입니다.");
		}
		
		System.out.println("학생 " + studentName + "님의 총점은" + total + "점 입니다");
	}
	
}
