
public abstract class Shape implements Drawable,Movable{//60171631 ±èÇöÁß
	double x,y;
	public Shape(double x, double y) {
		this.x = x;
		this.y = y;

	} 
	
	public abstract double getArea();//³ĞÀÌ
	public abstract double getlength();//µÑ·¹
	public void move(double dx, double dy) {
		
	}
}
