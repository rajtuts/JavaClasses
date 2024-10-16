class Outer_Demo {
   int num;
   
   // Accessing he inner class from the method within
   void display_Inner() {
     
	  
	  class Inner_Demo {
		  public void print() {
			 System.out.println("This is an method local inner class");
		  }
	   }
	   Inner_Demo inner = new Inner_Demo();
       inner.print();
   }
}
   
public class MethodLocalInnerClassDemo {

   public static void main(String args[]) {
      // Instantiating the outer class 
      Outer_Demo outer = new Outer_Demo();	  
      
      // Accessing the display_Inner() method.
      outer.display_Inner();
   }
}