
public abstract class Shape implements Drawable,Movable{//60171631 ������
	double x,y;
	public Shape(double x, double y) {
		this.x = x;
		this.y = y;

	} 
	
	public abstract double getArea();//����
	public abstract double getlength();//�ѷ�
	public void move(double dx, double dy) {
		
	}
}
