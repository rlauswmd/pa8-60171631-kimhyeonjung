
public class Square extends Shape{
	double width;//�ʺ�
	public Square(double x, double y, double width) {
		super(x,y);
		this.width = width;
	}
	public void draw() {
		
	}
	public double getArea() {//����
		double area = width*width;
		return area;
	}
	public double getlength() {//�ѷ�
		double length = 4*width;
		return length;
	}
}
