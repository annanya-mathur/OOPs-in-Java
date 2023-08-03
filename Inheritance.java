class Shape{
    
    int area;
}



class triangle extends Shape{
   
    
     triangle(int b, int h)
     {
         this.area=(b*h)/2;
     }
     public void printInfo()
     {
         System.out.println(this.area);
     }
    
}

class rectangle extends Shape{
    
     rectangle(int l, int b)
     {
         this.area=l*b;
     }
     public void printInfo()
     {
         System.out.println(this.area);
     }
    
}
public class Main
{
  public static void main (String[]args)
  {
  
   triangle t1= new triangle(2,3);
   rectangle r1= new rectangle(2,3);
  
   t1.printInfo();
   r1.printInfo();
      
  }
}
