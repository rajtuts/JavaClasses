class Area {
	int length;
	int breadth;
	
	Area(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;		
	}

	public void setLength(int length) {
	    this.length = length;
	}
	public int getLength() {
	    return length;
	}
	
	public void setBreadth(int breadth) {
	    this.breadth = breadth;
	} 
	public int getBreadth() {
		return breadth;
	}
	
	public int	getArea() {
		return length * breadth;
	}
}