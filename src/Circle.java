
public class Circle extends Shape{
	double radius;//������
	
	public Circle(double x, double y, double radious) {
		super(x,y);
		this.radius = radious;
	}//�������̵�
	public double getArea() {
		double area = (3.14)*(radius*radius);
		return area;
	}
	public double getlength() {
		double length = (3.14)*(2*radius);
		return length;
	}
	public void draw(){
		System.out.printf("(%.1f,%.1f)-radius(%.1f)\n",x,y,radius);
	}//�������̵�
	
	public void move(double dx, double dy) {
		
		for (int i=0; i<10 ; i++) {
			x+=dx;
			y+=dy;
			draw();
		}
		
	}
}
