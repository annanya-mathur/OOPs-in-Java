interface Animal
{
  void walk ();
}

class Horse implements Animal
{

  public void walk ()
  {
    System.out.println ("Can walk on 4 legs");
  }
  Horse ()
  {
    System.out.println ("Horse Created");
  }
}

class chicken implements Animal
{

  public void walk ()
  {
    System.out.println ("Can walk on 2 legs");
  }
  chicken ()
  {
    System.out.println ("chicken Created");
  }
}

public class Main
{
  public static void main (String[]args)
  {

    Horse h1 = new Horse ();
    chicken c1 = new chicken ();
      h1.walk ();
      c1.walk ();
  }
}
