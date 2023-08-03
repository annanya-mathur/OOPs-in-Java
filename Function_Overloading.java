class Student
{
  String name;
  int age;
  
  // Function Overloading

  public void print (String name)
  {
    System.out.println (name);
    System.out.println ();
  }
  
  public void print(int age)
  {
      System.out.println (age);
    System.out.println ();
  }
 public void print(String name , int age)
 {
     System.out.println (name +" "+age);
    System.out.println ();
 }
 
  // Default Constructor
  Student ()
  {
    System.out.println ("Default Constructor");
  }

  // Parameterised Constructor
  Student (String name, int age)
  {
    this.name = name;
    this.age = age;
  }

  // Copy Constructor
  Student (Student s2)
  {
    this.name = s2.name;
    this.age = s2.age;
  }

}

public class Main
{
  public static void main (String[]args)
  {
    Student s1 = new Student ();
    Student s2 = new Student ("Annanya", 21);
    Student s3 = new Student (s2);
      s3.print (s1.name);
      s3.print (s1.age);
      s3.print (s1.name , s1.age);
      
  }
}
