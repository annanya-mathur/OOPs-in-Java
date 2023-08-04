abstract class Animal
{
  Animal ()
  {
    System.out.println ("Animal Created");
  }

  abstract void walk ();

  public void eat ()
  {
    System.out.println ("Animal can eat");
  }
}

class Horse extends Animal
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

class chicken extends Animal
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
  }
}
