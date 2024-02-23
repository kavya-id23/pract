class Student
{
    int id,age;
    String name;
    Student()
    {
          System.out.println("it is default"); }
     Student(int i , string n)
    {     id=i;
          name=n;  }
     Student(student s)
    {
          id=s.id;
          name=s.name;  }
  
void display()
    {        System.out.println(id+" "+name);
     }
     public static void main(String args[])
    {
       Student b = new Student();
       Student s1 = new Student(18014,"kavya");
       Student s2 = new Student(s1);
       s1.display();
       s2.display();
    } 
}