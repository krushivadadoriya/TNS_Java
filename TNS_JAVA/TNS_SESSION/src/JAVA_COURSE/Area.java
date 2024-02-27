package java_course;

public class Area {
	int  len;
	int breadth;
	public void setArea(int len , int breadth) {
		this.breadth=breadth;
		this.len=len;
	}
	public int getArea() {
		return len*breadth;
	}
}
