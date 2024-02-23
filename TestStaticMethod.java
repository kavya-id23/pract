class Student
{
  	int rollno;
  	String name;
  	static String college = "ITS";

  	static void change()
	{
		college = "SIWS";
  	}

  	Student(int r,String n)
	{ 
		rollno=r;
		name=n;
	}

 	 void display()
	{
 	 System.out.println(rollno+" "+name+" "+college);
	}
}

public class TestStaticMethod
{
	public static void main(String args[])
	{
	Student.change();
	Student s1 = new Student(18014,"KAVYA");
	Student s2 = new Student(18025,"RIYA");
	Student s3 = new Student(18011,"BHAKTI");
 	s1.display();
	s2.display();
	s3.display();
	}
}