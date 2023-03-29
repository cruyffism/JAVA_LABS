package array;

public class Book {
	
	//객체 배열 만들
	
   private String bookName; // private은 외부에서 접근하려면 메서드가 필요
   private String author;
   
   public Book() {}  // 컨스트럭 생성?
   public Book(String bookName, String author) {
	   this.bookName = bookName;
	   this.author = author;	   
   }
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
   
   public void showBookInfo() {
	   System.out.println(bookName + "," + author);
   }
	
}
