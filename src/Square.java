
public class Square extends Shape{
	double width;//너비
	public Square(double x, double y, double width) {
		super(x,y);
		this.width = width;
	}
	public void draw() {
		
	}
	public double getArea() {//넓이
		double area = width*width;
		return area;
	}
	public double getlength() {//둘레
		double length = 4*width;
		return length;
	}
}
