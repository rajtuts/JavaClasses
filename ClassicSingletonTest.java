class ClassicSingleton {
	public static ClassicSingleton classicSingleton = null;
	
	private ClassicSingleton() {
		System.out.println("ClassicSingleton constructor called");//3
	}
	
	public static ClassicSingleton getInstance() {
		if(classicSingleton==null) {
			System.out.println("inside getInstance if condition - ClassicSingleton is null");//2
			classicSingleton = new ClassicSingleton();
		} else {
			System.out.println("inside getInstance else block - ClassicSingleton is null");//5
		}
		return classicSingleton;
	}
}
public class ClassicSingletonTest {
	public static void main(String[] args) {
		System.out.println(" before  creating c1-ClassicSingleton instance");//1
		ClassicSingleton c1 = ClassicSingleton.getInstance();
		System.out.println(" before  creating c2-ClassicSingleton instance");//4
		ClassicSingleton c2 = ClassicSingleton.getInstance();
		System.out.println("end of main method");//6
	}
}

 