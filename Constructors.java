class Student
{
  String name;
  int age;

  public void print ()
  {
    System.out.println (this.name);
    System.out.println (this.age);
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
      s2.print ();
    Student s3 = new Student (s2);
      s3.print ();
  }
}
