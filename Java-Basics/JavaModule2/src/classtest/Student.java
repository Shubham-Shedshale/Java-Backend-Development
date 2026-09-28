package classtest;

public class Student 
{
  private int rollno;
  private String name;
  private double marks;
  
  public int getrollnoby()
  {
	  return rollno;
  }
  
  public void setrollnoby(int rollno)
  {
	  this.rollno=rollno;
  }
  
  public String getnameby()
  {
	  return name;
  }
  
  public void setnameby(String name)
  {
	  this.name=name;
  }
  
  public double getmarksby()
  {
	  return marks;
  }
  
  public void setmarksby(double marks)
  {
	  this.marks=marks;
  }
  
 public static void main(String[] args)
 {
	Student s1=new Student();
	s1.setnameby("Raj");
	s1.setrollnoby(1);
	s1.setmarksby(50);
	s1.setmarksby(60);
	
	System.out.println(s1.getnameby());
	System.out.println(s1.getmarksby());
	System.out.println(s1.getrollnoby());
	
}
}
