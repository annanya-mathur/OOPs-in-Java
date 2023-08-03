class pen{
    
    String color;
    String type;
    public void write()
    {
        System.out.println("Writing");
        System.out.println(type);
        System.out.println(color);
    }
}
public class Main
{
	public static void main(String[] args) {
	     pen p1= new pen();
	     p1.color="blue";
	     p1.type="ball";
	     p1.write();
	}
}

