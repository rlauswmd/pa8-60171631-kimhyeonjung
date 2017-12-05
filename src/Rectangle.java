
public class Rectangle extends Shape{
	double z,w;//(x+z,y+w) = 두 번쨰 좌표
	
	public Rectangle(double x, double y, double z, double w) {
		super(x,y);
		this.z = z;
		this.w = w;
		
	}//오버라이드
	public double getArea() {
		double area = z*w;
		return area;
	}
	public double getlength() {
		double length = 2*(z+w);
		return length;
	}
	public void draw(){
		System.out.printf("(%.1f,%.1f)-(%.1f,%.1f)\n",x,y,(x+z),(x+w));
	}//오버라이드
}
