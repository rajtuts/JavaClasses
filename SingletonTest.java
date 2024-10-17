class Singleton {
	private static Singleton singleton = new Singleton( );// Eager way of creating Singleton object
	private Singleton() {
		System.out.println("Singleton constructor called");//2
	}
	
	public static Singleton getInstance( ) {
	  System.out.println("inside getInstance method");//3 	
      return singleton;
   }
}

public class SingletonTest {
	
	
	public static void main(String[] args) {
		System.out.println("before creeating Singleton class");//1
		Singleton s1 = Singleton.getInstance();
		System.out.println("after Singleton class created");//4
		Singleton s2 = Singleton.getInstance();
	}
}