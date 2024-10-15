abstract class Shape {

	String color;
	abstract double area();
	
	
	Shape(String color)
	{
		System.out.println("Shape constructor called");
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
}