class pen{
    
    String color;
    String type;
    public void write()
    {
        System.out.println("Writing");
        
    }
    public void print()
    {
        System.out.println(this.type);
        System.out.println(this.color);
        System.out.println();
    }
}
public class Main
{
	public static void main(String[] args) {
	     pen p1= new pen();
	     p1.color="blue";
	     p1.type="ball";
	     
	      pen p2= new pen();
	     p2.color="red";
	     p2.type="ball";
	     
	      pen p3= new pen();
	     p3.color="green";
	     p3.type="gel";
	     
	     p1.write();
	     p1.print();
	     p2.print();
	     p3.print();
	}
}
