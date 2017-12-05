
public class Triangle extends Shape{
	double bottom, width;
	public Triangle(double x,double y, double bottom, double width) {
		super(x,y);
		this.bottom = bottom;
		this.width = width;
	}
	public void draw() {
		System.out.println();
	}
	public double getArea() {
		double area =(bottom*width)/2;
		return area;
	}
	public double getlength() {
		double length =  bottom+2*(Math.sqrt((bottom/2)*(bottom/2)+(width*width)));
		return length;
	}
	
}
