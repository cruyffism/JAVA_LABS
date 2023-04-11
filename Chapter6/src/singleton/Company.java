package singleton;

public class Company {
   
  private static Company instance = new Company();
  
  private Company(){} //디폴트생성자?
  
  public static Company getInstance() {
	  if(instance == null)
		  instance = new Company();
	  return instance;
  }
  
}
