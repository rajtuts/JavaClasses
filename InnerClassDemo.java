class Outer_Demo {
   int num;
   
   // inner class
   public class Inner_Demo {
      public void print() {
         System.out.println("This is an inner class");
      }
   }
   
   // Accessing he inner class from the method within
   void display_Inner() {
      Inner_Demo inner = new Inner_Demo();
      inner.print();
   }
}
   
public class InnerClassDemo {

   public static void main(String args[]) {
      // Instantiating the outer class 
      Outer_Demo outer = new Outer_Demo();
	  Outer_Demo.Inner_Demo innerDemo =  outer.new Inner_Demo();
      
      // Accessing the display_Inner() method.
      innerDemo.print();
   }
}