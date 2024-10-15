class Circle implements Shape, {
	double radius;
	
	Circle(String color,double radius) {
		super(color);
		this.radius = radius;
	}
	
	double area() {
		return Math.PI * Math.pow(radius,2);
	}
	
}