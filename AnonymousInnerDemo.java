abstract class AnonymousInner {
   public abstract void mymethod();
}

public class AnonymousInnerDemo {
	public static void main(String[] args) {
		AnonymousInner myclass = new AnonymousInner(){
			public void mymethod() {
				System.out.println("My method called");
			}
		};
		myclass.mymethod();
	}
}