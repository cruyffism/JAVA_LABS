package array;

public class Book {
	
	//��ü �迭 ����
	
   private String bookName; // private�� �ܺο��� �����Ϸ��� �޼��尡 �ʿ�
   private String author;
   
   public Book() {}  // ����Ʈ�� ����?
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
