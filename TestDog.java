class Animal {
   public void move() {
      System.out.println("Animals can move");
   }
   
   public Animal getObject() {
   	  System.out.println("from Animal");
      return new Animal();
   }
}

class Dog extends Animal {
   public void move() {
      System.out.println("Dogs can walk and run");
   }
   public void bark() {
      System.out.println("Dogs can bark");
   }
   
   public Dog getObject() {
   	  	System.out.println("from Dog");
      return new Dog();
   }
}

 class TestDog {

   public static void main(String args[]) {
      Animal a = new Animal();   // Animal reference and object
      Animal b = new Dog();   // Animal reference but Dog object

      a.move();   // runs the method in Animal class
      b.move();   // runs the method in Dog class
      b.getObject();
   }
}