
public class Text implements Drawable{
	String string;
	public Text(String string) {
		this.string = string;
	}
	public void draw() {
		System.out.println(string);
	}//오버라이드
}
