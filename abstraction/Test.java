class Test {
	public static void main(String[] args) {
		Shape s1 = new Circle("Red",5);
		Shape s2 = new Rectangle("Green", 3, 2);
		
		System.out.println("Circle area:"+s1.area());
		System.out.println("Rectange area:"+s2.area());
	}
}