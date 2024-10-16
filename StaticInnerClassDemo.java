class Outer_Demo {
   int num;
   
   // inner class
   static public class Inner_Demo {
      static public void print() {
         System.out.println("This is an inner class");
      }
	  public void print2() {
         System.out.println("This is an inner class print2 method`");
      }
   }
   
   // Accessing he inner class from the method within
   void display_Inner() {
      Inner_Demo inner = new Inner_Demo();
      inner.print();
   }
}
   
public class StaticInnerClassDemo {

   public static void main(String args[]) {
      // Instantiating the outer class 
      //Outer_Demo outer = new Outer_Demo();
	  //Outer_Demo.Inner_Demo innerDemo =  outer.new Inner_Demo();
      
      // Accessing the display_Inner() method.
      Outer_Demo.Inner_Demo.print();
	  new Outer_Demo.Inner_Demo().print2();
   }
}